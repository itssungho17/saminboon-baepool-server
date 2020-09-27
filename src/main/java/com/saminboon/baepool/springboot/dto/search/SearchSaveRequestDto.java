package com.saminboon.baepool.springboot.dto.search;

import com.saminboon.baepool.springboot.domain.search.Search;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SearchSaveRequestDto {
    private String text;

    @Builder
    public SearchSaveRequestDto(String text) {
        this.text = text;
    }

    public Search toEntity() {
        return Search.builder()
                .text(text)
                .build();
    }
}
