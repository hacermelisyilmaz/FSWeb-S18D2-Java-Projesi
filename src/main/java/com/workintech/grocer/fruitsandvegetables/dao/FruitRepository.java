package com.workintech.grocer.fruitsandvegetables.dao;

import com.workintech.grocer.fruitsandvegetables.entity.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {
}
