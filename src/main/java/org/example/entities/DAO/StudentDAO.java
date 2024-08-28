package org.example.entities.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import org.example.HibernateConfig;
import org.example.entities.Student;

import java.util.Set;
import java.util.stream.Collectors;

public class StudentDAO implements IDAO<Student> {

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    @Override
    public void create(Student student) {
        //try sørger for at ressursen bliver lukket når den har læst curly braces
        try( EntityManager em = emf.createEntityManager()){
            //transaktioner gør det sikkert at lave transaktioner af data
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        }
    }

    @Override
    public void update(Student student){
        try(EntityManager em = emf.createEntityManager()){
            //transaktioner gør det sikkert at lave transaktioner af data
            em.getTransaction().begin();
            em.merge(student);
            em.getTransaction().commit();
        }
    }

    @Override
    public void delete(Student student){
        try(EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            em.remove(student);
            em.getTransaction().commit();
        }
    }

    @Override
    public Set<Student> getAll() {
        try(EntityManager em = emf.createEntityManager()){
            //vi bruger jpl, hvor man bruger objekter i stedet for sql
            TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s",Student.class);
            return query.getResultList().stream()
                    .collect(Collectors.toSet());
        }
    }

    @Override
    public Student getById(int id) {
        try(EntityManager em = emf.createEntityManager()){
            //vi bruger jpl, hvor man bruger objekter i stedet for sql
            TypedQuery<Student> query =em.createQuery("SELECT s FROM Student s where s.id= :id",Student.class);
            query.setParameter("id",id );
            return query.getSingleResult();
        }
    }






}
