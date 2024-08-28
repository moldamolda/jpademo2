package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author laith kaseb
 **/


public class StudentDAO<T> implements IDAO<Student>{

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    @Override
    public void create(Student student) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        }

    }

    @Override
    public Student getById(int id) {
        try(EntityManager em= emf.createEntityManager()){
            TypedQuery<Student> query= em.createQuery("select u from Student u where u.id=:id", Student.class);
            query.setParameter("id",id);
            return query.getSingleResult();
        }
    }

    @Override
    public Set<Student> getALl() {
        try (EntityManager em = emf.createEntityManager()) {
            TypedQuery<Student>  query= em.createQuery("select u from Student u", Student.class);

            return query.getResultList().stream().collect(Collectors.toSet());
        }
    }

    @Override
    public void update(Student student) {
        try(EntityManager em= emf.createEntityManager()){
            em.getTransaction().begin();
            Query query= em.createQuery("UPDATE Student u SET u.email =:email where u.id=:id");
            query.setParameter("email",student.getEmail());
            query.setParameter("id",student.getId());
            query.executeUpdate();
            em.getTransaction().commit();

        }
    }

    @Override
    public void delete(Student user) {
        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.remove(user.id);
            em.getTransaction().commit();
        }
    }

    public List<Student> showAllEnrolletAfterSpecificYear(int year) {
        try (EntityManager em = emf.createEntityManager()) {
            Query query = em.createQuery("select u from Student u where u.dateOfEnrollment>:year", Student.class);
            query.setParameter("year", LocalDate.of(year, 1, 1));
            return query.getResultList();

        }
    }


}
