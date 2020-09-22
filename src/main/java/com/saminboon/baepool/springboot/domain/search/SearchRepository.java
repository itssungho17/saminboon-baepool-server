package com.saminboon.baepool.springboot.domain.search;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SearchRepository extends JpaRepository<Search, Long> {
    List<Search> findAll();
}
