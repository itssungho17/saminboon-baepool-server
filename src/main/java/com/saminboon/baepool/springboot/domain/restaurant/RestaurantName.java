package com.saminboon.baepool.springboot.domain.restaurant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RestaurantName {

    꼼떼바베큐("꼼떼바베큐"),
    동양식당("동양식당"),
    바우네나주곰탕("바우네나주곰탕"),
    사이공윤다이("사이공윤다이"),
    남도복국("남도복국"),
    새마을식당("새마을식당"),
    코코이찌방야("코코이찌방야"),
    스타크랩("스타크랩"),
    공항칼국수("공항칼국수"),
    신전떡볶이("신전떡볶이");

    private final String key;
}
