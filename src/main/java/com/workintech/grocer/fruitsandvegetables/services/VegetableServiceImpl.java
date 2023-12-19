package com.workintech.grocer.fruitsandvegetables.services;

import com.workintech.grocer.fruitsandvegetables.dao.VegetableRepository;
import com.workintech.grocer.fruitsandvegetables.entity.Vegetable;
import com.workintech.grocer.fruitsandvegetables.exceptions.FruitAndVegetableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VegetableServiceImpl implements VegetableService {
    private VegetableRepository vegetableRepository;

    @Autowired
    public VegetableServiceImpl(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public Vegetable save(Vegetable vegetable) {
        return vegetableRepository.save(vegetable);
    }

    @Override
    public List<Vegetable> findAll() {
        return vegetableRepository.findAll();
    }

    @Override
    public Vegetable findById(Integer id) {
        Optional<Vegetable> vegetableOptional = vegetableRepository.findById(id);
        if (vegetableOptional.isPresent()) return vegetableOptional.get();
        throw new FruitAndVegetableException("Vegetable with the given ID is not found: " + id, HttpStatus.BAD_REQUEST);
    }

    @Override
    public List<Vegetable> searchByName(String name) {
        return vegetableRepository.searchByName(name);
    }

    @Override
    public List<Vegetable> sortAscByPrice() {
        return vegetableRepository.sortAscByPrice();
    }

    @Override
    public List<Vegetable> sortDescByPrice() {
        return vegetableRepository.sortDescByPrice();
    }

    @Override
    public Vegetable delete(Integer id) {
        Vegetable vegetable = findById(id);
        vegetableRepository.delete(vegetable);
        return vegetable;
    }
}
