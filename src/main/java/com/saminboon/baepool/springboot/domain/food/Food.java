package com.saminboon.baepool.springboot.domain.food;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FoodName name;

    @Column(nullable = false)
    private Long food_category;

    @Column(nullable = false)
    private Long restaurant;

    @Builder
    public Food(FoodName name, Long food_category, Long restaurant) {
        this.name = name;
        this.food_category = food_category;
        this.restaurant = restaurant;
    }

    public void update(FoodName name, Long food_category, Long restaurant) {
        this.name = name;
        this.food_category = food_category;
        this.restaurant = restaurant;
    }
}
