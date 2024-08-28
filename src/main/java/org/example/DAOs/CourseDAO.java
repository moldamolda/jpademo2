package org.example.DAOs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.example.HibernateConfig;
import org.example.entities.Course;
import org.example.entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Purpose:
 *
 * @author: Jeppe Koch
 */
public class CourseDAO implements IDAO<Course> {
    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    private  List<Course> courseList = new ArrayList<>();

    public void addCourse(Course course){
        courseList.add(course);
    }
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
        try (EntityManager em = emf.createEntityManager()) {
            TypedQuery<Course> query = em.createQuery("select c from Course c where c.id = :id", Course.class);
            query.setParameter("id", id);
            Course course = query.getSingleResult();
            return course;
        }
    }

    @Override
    public Set<Course> getAll() {
        try (EntityManager em = emf.createEntityManager()) {
            TypedQuery<Course> query = em.createQuery("select c from Course c", Course.class);
            return query.getResultList().stream().collect(Collectors.toSet());
        }

    }

    @Override
    public void update(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            Query query = em.createQuery("UPDATE Course c SET c.name =:name where c.id=:id");
            query.setParameter("name", course.getName());
            query.setParameter("id", course.getId());
            query.executeUpdate();
            em.getTransaction().commit();

        }
    }


    @Override
    public void delete(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();

        }
    }


    public List<Course> filterByCourseTaught(String input) {


        List<Course> filteredCourses = courseList.stream()
                .filter(course -> course.getName() != null && course.getName().toLowerCase().contains(input.toLowerCase()))
                .collect(Collectors.toList());

        for (Course course : courseList) {
        System.out.println("Name: " + course.getName() + ", Teacher: " + course.getTeacher());
    }
        return filteredCourses;
    }

}

