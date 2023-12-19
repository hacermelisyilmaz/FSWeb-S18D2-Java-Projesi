package com.workintech.grocer.fruitsandvegetables.controller;

import com.workintech.grocer.fruitsandvegetables.entity.Fruit;
import com.workintech.grocer.fruitsandvegetables.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/fruits")
public class FruitController {
    private FruitService fruitService;

    @Autowired
    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @GetMapping
    public List<Fruit> sortAscByPrice() {
        return fruitService.sortAscByPrice();
    }

    @GetMapping("/{id}")
    public Fruit findById(@PathVariable int id) {
        return fruitService.findById(id);
    }

    @GetMapping("/desc")
    public List<Fruit> sortDescByPrice() {
        return fruitService.sortDescByPrice();
    }

    @PostMapping
    public Fruit save(@RequestBody Fruit fruit) {
        return fruitService.save(fruit);
    }

    @PostMapping("/{name}")
    public List<Fruit> searchByName(@RequestBody String name) {
        return fruitService.searchByName(name);
    }

    @DeleteMapping("/{id}")
    public Fruit delete(@PathVariable int id) {
        return fruitService.delete(id);
    }
}
