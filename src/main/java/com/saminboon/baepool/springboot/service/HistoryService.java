package com.saminboon.baepool.springboot.service;

import com.saminboon.baepool.springboot.domain.history.History;
import com.saminboon.baepool.springboot.domain.history.HistoryRepository;
import com.saminboon.baepool.springboot.dto.history.HistoryListResponseDto;
import com.saminboon.baepool.springboot.dto.history.HistoryResponseDto;
import com.saminboon.baepool.springboot.dto.history.HistorySaveRequestDto;
import com.saminboon.baepool.springboot.dto.history.HistoryUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class HistoryService {
    private final HistoryRepository historyRepository;

    @Transactional
    public Long save(HistorySaveRequestDto requestDto) {
        return historyRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, HistoryUpdateRequestDto requestDto) {
        History history = historyRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        history.update(requestDto.getFood(), requestDto.getRestaurant(), requestDto.getRating(), requestDto.getAccess());

        return id;
    }

    @Transactional
    public void delete(Long id) {
        History history = historyRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        historyRepository.delete(history);
    }

    @Transactional(readOnly = true)
    public HistoryResponseDto findById(Long id) {
        History entity = historyRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

        return new HistoryResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<HistoryListResponseDto> findAllDesc() {
        return historyRepository.findAll().stream()
                .map(HistoryListResponseDto::new)
                .collect(Collectors.toList());
    }
}
