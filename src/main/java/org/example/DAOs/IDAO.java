package org.example.DAOs;

import org.example.entities.Course;
import org.example.entities.Student;

import java.util.Set;

public interface IDAO<T> {
    void create(T user);

    T getById(int id);
    Set<T> getAll();

    void update(T t);
    void delete(T t);
}
