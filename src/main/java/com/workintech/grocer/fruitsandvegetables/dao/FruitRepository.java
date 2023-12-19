package com.workintech.grocer.fruitsandvegetables.dao;

import com.workintech.grocer.fruitsandvegetables.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {
    @Query("SELECT f FROM Fruit f ORDER BY f.price ASC")
    List<Fruit> sortAscByPrice();

    @Query("SELECT f FROM Fruit f ORDER BY f.price DESC")
    List<Fruit> sortDescByPrice();

    @Query("SELECT f FROM Fruit f WHERE f.name LIKE %:name%")
    List<Fruit> searchByName(String name);
}
