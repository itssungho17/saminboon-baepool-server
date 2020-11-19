package com.saminboon.baepool.springboot.domain.history;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AccessScope {

    PUBLIC("PUBLIC"),
    REGION("REGION"),
    COMPANY("COMPANY"),
    TEAM("TEAM"),
    PRIVATE("PRIVATE");

    private final String key;

}
