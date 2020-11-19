package com.saminboon.baepool.springboot.dto.search;

import com.saminboon.baepool.springboot.domain.search.Search;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class SearchListResponseDto {
    private Long id;
    private LocalDateTime createdDate;
    private String text;

    public SearchListResponseDto(Search entity) {
        this.id = entity.getId();
        this.createdDate = entity.getCreatedDate();
        this.text = entity.getText();
    }
}
