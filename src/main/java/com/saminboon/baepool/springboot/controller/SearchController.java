package com.saminboon.baepool.springboot.controller;

import com.saminboon.baepool.springboot.dto.history.HistoryListResponseDto;
import com.saminboon.baepool.springboot.dto.search.SearchListResponseDto;
import com.saminboon.baepool.springboot.dto.search.SearchSaveRequestDto;
import com.saminboon.baepool.springboot.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class SearchController {
    private final SearchService service;

    @GetMapping("/v1.0/search")
    public List<SearchListResponseDto> getTop10() {
        return service.getTop10();
    }

    @PostMapping("/v1.0/search")
    public Long send(@RequestBody SearchSaveRequestDto requestDto) {
        return service.send(requestDto);
    }

    @GetMapping("/v1.0/search/{text}")
    public List<HistoryListResponseDto> getHistoryListByText(@PathVariable String text) {
        return service.getHistoryListByText(text);
    }
}
