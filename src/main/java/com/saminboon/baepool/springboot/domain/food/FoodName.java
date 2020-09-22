package com.saminboon.baepool.springboot.domain.food;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FoodName {

    짜장면("짜장면"),
    짬뽕("짬뽕"),
    피자("피자"),
    파스타("파스타"),
    한정식("한정식"),
    치킨("치킨"),
    햄버거("햄버거"),
    족발("족발"),
    국수("국수"),
    돈까스("돈까스"),
    볶음밥("볶음밥"),
    설렁탕("설렁탕");

    private final String key;
}
