package com.saminboon.baepool.springboot.dto.history;

import com.saminboon.baepool.springboot.domain.food.FoodName;
import com.saminboon.baepool.springboot.domain.history.History;
import com.saminboon.baepool.springboot.domain.history.AccessScope;
import com.saminboon.baepool.springboot.domain.restaurant.RestaurantName;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HistorySaveRequestDto {
    private FoodName food;
    private RestaurantName restaurant;
    private Integer rating;
    private AccessScope access;

    @Builder
    public HistorySaveRequestDto(FoodName food, RestaurantName restaurant, Integer rating, AccessScope access) {
        this.food = food;
        this.restaurant = restaurant;
        this.rating = rating;
        this.access = access;
    }

    public History toEntity() {
        return History.builder()
                .food(food)
                .restaurant(restaurant)
                .rating(rating)
                .access(access)
                .build();
    }
}
