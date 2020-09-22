package com.saminboon.baepool.springboot.domain.search;

import com.saminboon.baepool.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Search extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long user;

    @Column(nullable = false)
    private String word;

    @Builder
    public Search(Long user, String word) {
        this.user = user;
        this.word = word;
    }

    public void update(Long user, String word) {
        this.user = user;
        this.word = word;
    }
}
