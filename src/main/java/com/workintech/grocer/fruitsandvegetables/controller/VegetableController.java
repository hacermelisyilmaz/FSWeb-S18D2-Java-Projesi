package com.workintech.grocer.fruitsandvegetables.controller;

import com.workintech.grocer.fruitsandvegetables.entity.Vegetable;
import com.workintech.grocer.fruitsandvegetables.services.VegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workintech/vegetables")
public class VegetableController {
    private VegetableService vegetableService;

    @Autowired
    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @GetMapping
    public List<Vegetable> sortAscByPrice() {
        return vegetableService.sortAscByPrice();
    }

    @GetMapping("/{id}")
    public Vegetable findById(@PathVariable int id) {
        return vegetableService.findById(id);
    }

    @GetMapping("/desc")
    public List<Vegetable> sortDescByPrice() {
        return vegetableService.sortDescByPrice();
    }

    @PostMapping
    public Vegetable save(@RequestBody Vegetable vegetable) {
        return vegetableService.save(vegetable);
    }

    @PostMapping("/{name}")
    public List<Vegetable> searchByName(@RequestBody String name) {
        return vegetableService.searchByName(name);
    }

    @DeleteMapping("/{id}")
    public Vegetable delete(@PathVariable int id) {
        return vegetableService.delete(id);
    }
}
