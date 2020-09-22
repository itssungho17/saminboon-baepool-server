package com.saminboon.baepool.springboot.domain.history;

import com.saminboon.baepool.springboot.domain.BaseTimeEntity;
import com.saminboon.baepool.springboot.domain.food.FoodName;
import com.saminboon.baepool.springboot.domain.restaurant.RestaurantName;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class History extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FoodName food;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RestaurantName restaurant;

    @Column(nullable = false)
    private Integer rating;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccessScope access;

    @Builder
    public History(FoodName food, RestaurantName restaurant, Integer rating, AccessScope access) {
        this.food = food;
        this.restaurant = restaurant;
        this.rating = rating;
        this.access = access;
    }

    public void update(FoodName food, RestaurantName restaurant, Integer rating, AccessScope access) {
        this.food = food;
        this.restaurant = restaurant;
        this.rating = rating;
        this.access = access;
    }
}
