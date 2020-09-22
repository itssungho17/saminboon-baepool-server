package com.saminboon.baepool.springboot.domain.team;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long company;

    @Builder
    public Team(String name, Long company) {
        this.name = name;
        this.company = company;
    }

    public void update(String name, Long company) {
        this.name = name;
        this.company = company;
    }
}
