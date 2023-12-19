package com.workintech.grocer.fruitsandvegetables.services;

import com.workintech.grocer.fruitsandvegetables.entity.Fruit;
import com.workintech.grocer.fruitsandvegetables.entity.Vegetable;

import java.util.List;

public interface VegetableService {
    Vegetable save(Vegetable vegetable);
    List<Vegetable> findAll();
    Vegetable findById(Integer id);

    List<Vegetable> searchByName(String name);

    List<Vegetable> sortAscByPrice();

    List<Vegetable> sortDescByPrice();

    Vegetable delete(Integer id);
}
