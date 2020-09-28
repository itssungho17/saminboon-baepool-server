package com.saminboon.baepool.springboot.controller;

import com.saminboon.baepool.springboot.service.HistoryService;
import com.saminboon.baepool.springboot.dto.history.HistoryListResponseDto;
import com.saminboon.baepool.springboot.dto.history.HistoryResponseDto;
import com.saminboon.baepool.springboot.dto.history.HistorySaveRequestDto;
import com.saminboon.baepool.springboot.dto.history.HistoryUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class HistoryApiController {

    private final HistoryService historyService;

    @PostMapping("/api/v1/history")
    public Long save(@RequestBody HistorySaveRequestDto requestDto) {
        return historyService.save(requestDto);
    }

    @PutMapping("/api/v1/history/{id}")
    public Long update(@PathVariable Long id, @RequestBody HistoryUpdateRequestDto requestDto) {
        return historyService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/history/{id}")
    public Long delete(@PathVariable Long id) {
        historyService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/history/{id}")
    public HistoryResponseDto findById(@PathVariable Long id) {
        return historyService.findById(id);
    }

    @GetMapping("/api/v1/history/list")
    public List<HistoryListResponseDto> findAll() {
        return historyService.findAllDesc();
    }

    //sds
}
