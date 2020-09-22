package com.saminboon.baepool.springboot.web.dto.history;

import com.saminboon.baepool.springboot.domain.food.FoodName;
import com.saminboon.baepool.springboot.domain.history.AccessScope;
import com.saminboon.baepool.springboot.domain.restaurant.RestaurantName;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class HistoryUpdateRequestDto {
    private FoodName food;
    private RestaurantName restaurant;
    private Integer rating;
    private AccessScope access;

    @Builder
    public HistoryUpdateRequestDto(FoodName food, RestaurantName restaurant, Integer rating, AccessScope access) {
        this.food = food;
        this.restaurant = restaurant;
        this.rating = rating;
        this.access = access;
    }
}
