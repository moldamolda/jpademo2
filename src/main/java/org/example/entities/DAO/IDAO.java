package org.example.entities.DAO;

import java.util.Set;

public interface IDAO<T> {

    void create(T t);

    Set<T> getAll();

    T getById(int id);
    //brug .merge
    void update(T t);
    //brug .remove
    //når vi ændrer noget i databasen skal vi bruge en transaktion
    void delete(T t);

}
