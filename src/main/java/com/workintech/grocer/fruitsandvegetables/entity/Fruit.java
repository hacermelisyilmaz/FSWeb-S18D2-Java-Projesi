package com.workintech.grocer.fruitsandvegetables.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "fruits", schema = "fruits-and-vegetables")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private Double price;

    @Enumerated(EnumType.STRING)
    private FruitType fruitType;
}
