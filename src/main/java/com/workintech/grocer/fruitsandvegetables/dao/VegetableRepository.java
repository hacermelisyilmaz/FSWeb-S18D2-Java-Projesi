package com.workintech.grocer.fruitsandvegetables.dao;

import com.workintech.grocer.fruitsandvegetables.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetableRepository extends JpaRepository<Vegetable, Integer> {
}
