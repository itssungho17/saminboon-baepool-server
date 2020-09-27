package com.saminboon.baepool.springboot.service;

import com.saminboon.baepool.springboot.domain.history.HistoryRepository;
import com.saminboon.baepool.springboot.domain.search.SearchRepository;
import com.saminboon.baepool.springboot.dto.history.HistoryListResponseDto;
import com.saminboon.baepool.springboot.dto.search.SearchListResponseDto;
import com.saminboon.baepool.springboot.dto.search.SearchSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class SearchService {
    private final SearchRepository repository;
    private final HistoryRepository historyRepository;

    @Transactional(readOnly = true)
    public List<SearchListResponseDto> getTop10() {
        return repository.findAll().stream()
                .map(SearchListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public Long send(SearchSaveRequestDto requestDto) {
        return repository.save(requestDto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<HistoryListResponseDto> getHistoryListByText(String text) {
        return historyRepository.findAll().stream()
                .map(HistoryListResponseDto::new)
                .collect(Collectors.toList());
    }
}
