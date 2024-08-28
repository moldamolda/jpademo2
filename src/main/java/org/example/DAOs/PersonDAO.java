package org.example.DAOs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.HibernateConfig;
import org.example.entities.Person;

import java.util.Set;

/**
 * Purpose:
 *
 * @author: Jeppe Koch
 */
public class PersonDAO implements IDAO<Person>{
    EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    public static void main(String[] args) {

    }

    @Override
    public void create(Person person) {
        try (EntityManager em = emf.createEntityManager()){
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        }
    }

    @Override
    public Person getById(int id) {
        return null;
    }

    @Override
    public Set<Person> getAll() {
        return null;
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }
}
