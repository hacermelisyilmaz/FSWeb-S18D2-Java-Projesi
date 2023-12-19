package com.workintech.grocer.fruitsandvegetables.services;

import com.workintech.grocer.fruitsandvegetables.dao.FruitRepository;
import com.workintech.grocer.fruitsandvegetables.entity.Fruit;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class FruitServiceImpl implements FruitService {
    private FruitRepository fruitRepository;

    @Autowired
    public FruitServiceImpl(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    @Override
    public Fruit save(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public List<Fruit> findAll() {
        return fruitRepository.findAll();
    }

    @Override
    public Fruit findById(Integer id) {
        Optional<Fruit> fruitOptional = fruitRepository.findById(id);
        if (fruitOptional.isPresent()) return fruitOptional.get();
        //TODO MELIS throw exception
        return null;
    }

    @Override
    public List<Fruit> searchByName(String name) {
        return fruitRepository.searchByName(name.toLowerCase());
    }

    @Override
    public List<Fruit> sortAscByPrice() {
        return fruitRepository.sortAscByPrice();
    }

    @Override
    public List<Fruit> sortDescByPrice() {
        return fruitRepository.sortDescByPrice();
    }

    @Override
    public Fruit delete(Integer id) {
        Fruit fruit = findById(id);
        fruitRepository.delete(fruit);
        return fruit;
    }
}
