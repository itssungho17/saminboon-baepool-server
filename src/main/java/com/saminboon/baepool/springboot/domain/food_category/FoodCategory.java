package com.saminboon.baepool.springboot.domain.food_category;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class FoodCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Builder
    public FoodCategory(String name) {
        this.name = name;
    }

    public void update(String name) {
        this.name = name;
    }
}