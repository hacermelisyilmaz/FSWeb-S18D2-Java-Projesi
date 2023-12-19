package com.workintech.grocer.fruitsandvegetables.services;

import com.workintech.grocer.fruitsandvegetables.entity.Fruit;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FruitService {
    Fruit save(Fruit fruit);
    List<Fruit> findAll();
    Fruit findById(Integer id);

    List<Fruit> searchByName(String name);

    List<Fruit> sortAscByPrice();

    List<Fruit> sortDescByPrice();

    Fruit delete(Integer id);
}
