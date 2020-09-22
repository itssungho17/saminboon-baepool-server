package com.saminboon.baepool.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    USER("ROLE_USER", "USER"),
    GUEST("ROLE_GUEST", "GUEST");

    private final String key;
    private final String title;

}
