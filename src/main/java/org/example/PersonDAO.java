package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.Set;

/**
 * @author laith kaseb
 **/


public class PersonDAO<T> implements IDAO<Person> {
    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();


    @Override
    public void create(Person user) {

    }

    @Override
    public Person getById(int id) {
        return null;
    }

    @Override
    public Set<Person> getALl() {
        return null;
    }

    @Override
    public void update(Person user) {

    }

    @Override
    public void delete(Person user) {

    }
}


