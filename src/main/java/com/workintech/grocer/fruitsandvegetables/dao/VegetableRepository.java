package com.workintech.grocer.fruitsandvegetables.dao;

import com.workintech.grocer.fruitsandvegetables.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Integer> {
    @Query("SELECT v FROM Vegetable v ORDER BY v.price ASC")
    List<Vegetable> sortAscByPrice();

    @Query("SELECT v FROM Vegetable v ORDER BY v.price DESC")
    List<Vegetable> sortDescByPrice();

    @Query("SELECT v FROM Vegetable v WHERE v.firstName LIKE %:name%")
    List<Vegetable> searchByName(String name);
}
