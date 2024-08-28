package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author laith kaseb
 **/


public class CurseDAO<T> implements IDAO<Course> {
    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    @Override
    public void create(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
        }

    }

    @Override
    public Course getById(int id) {
        try(EntityManager em= emf.createEntityManager()){
            TypedQuery<Course> query= em.createQuery("select u from Course u where u.id=:id", Course.class);
            query.setParameter("id",id);
            return query.getSingleResult();
        }
    }

    @Override
    public Set<Course> getALl() {
        try (EntityManager em = emf.createEntityManager()) {
            TypedQuery<Course>  query= em.createQuery("select u from Course u", Course.class);

            return query.getResultList().stream().collect(Collectors.toSet());
        }
    }

    @Override
    public void update(Course course) {
        try(EntityManager em= emf.createEntityManager()){
            em.getTransaction().begin();
            Query query= em.createQuery("UPDATE Course u SET u.name =:name where u.id=:id");
            query.setParameter("name",course.getName());
            query.setParameter("id",course.getId());
            query.executeUpdate();
            em.getTransaction().commit();

        }
    }

    @Override
    public void delete(Course course) {
        try(EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();
        }
    }
}
