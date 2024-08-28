package org.example.DAOs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.example.HibernateConfig;
import org.example.entities.Student;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Purpose:
 *
 * @author: Jeppe Koch
 */
public class StudentDAO implements IDAO<Student> {
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
        try (EntityManager em = emf.createEntityManager()) {
            TypedQuery<Student> query = em.createQuery("select s from Student s where s.id = :id", Student.class);
            query.setParameter("id", id);
            Student student = query.getSingleResult();
            return student;
        }
    }

    @Override
    public Set<Student> getAll() {
        try (EntityManager em = emf.createEntityManager()) {
            TypedQuery<Student> query = em.createQuery("select s from Student s", Student.class);
            return query.getResultList().stream().collect(Collectors.toSet());
        }

    }

    @Override
    public void update(Student student) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            Query query = em.createQuery("UPDATE Student s SET s.email =:email where s.id=:id");
            query.setParameter("email", student.getEmail());
            query.setParameter("id", student.getId());
            query.executeUpdate();
            em.getTransaction().commit();

        }
    }


    @Override
    public void delete(Student student) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.remove(student);
            em.getTransaction().commit();

        }

    }

    public List<Student> showAllEnrolletAfterSpecificYear(int year) {
        try (EntityManager em = emf.createEntityManager()) {
            Query query = em.createQuery("select s from Student s where s.dateOfEnrollment>:year", Student.class);
            query.setParameter("year", LocalDate.of(year, 1, 1));
            return query.getResultList();

        }
    }

}