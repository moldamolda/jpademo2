package org.example.entities.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import org.example.HibernateConfig;
import org.example.entities.Course;

import java.util.Set;
import java.util.stream.Collectors;


public class CourseDAO implements IDAO<Course>{

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    @Override
    public void create(Course course) {
        try( EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
        }
    }

    @Override
    public Set<Course> getAll() {
        try(EntityManager em = emf.createEntityManager()){
            TypedQuery<Course> query = em.createQuery("SELECT c FROM Course c",Course.class);
            return query.getResultList().stream()
                    .collect(Collectors.toSet());
        }
    }

    @Override
    public Course getById(int id) {
        try(EntityManager em = emf.createEntityManager()){
            TypedQuery<Course> query =em.createQuery("SELECT c FROM Course c where c.id= :id",Course.class);
            query.setParameter("id",id );
            return query.getSingleResult();
        }
    }

    @Override
    public void update(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.merge(course);
            em.getTransaction().commit();
        }
    }

    @Override
    public void delete(Course course) {
            try(EntityManager em = emf.createEntityManager()){
                em.getTransaction().begin();
                em.remove(course);
                em.getTransaction().commit();
            }
    }
}
