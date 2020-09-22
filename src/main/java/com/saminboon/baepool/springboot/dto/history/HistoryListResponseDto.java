package com.saminboon.baepool.springboot.dto.history;

import com.saminboon.baepool.springboot.domain.food.FoodName;
import com.saminboon.baepool.springboot.domain.history.AccessScope;
import com.saminboon.baepool.springboot.domain.history.History;
import com.saminboon.baepool.springboot.domain.restaurant.RestaurantName;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class HistoryListResponseDto {
    private Long id;
    private FoodName food;
    private RestaurantName restaurant;
    private Integer rating;
    private AccessScope access;
    private LocalDateTime modifiedDate;

    public HistoryListResponseDto(History entity) {
        this.id = entity.getId();
        this.food = entity.getFood();
        this.restaurant = entity.getRestaurant();
        this.rating = entity.getRating();
        this.access = entity.getAccess();
        this.modifiedDate = entity.getModifiedDate();
    }
}
