package com.saminboon.baepool.springboot.domain.search;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@Entity
public class Search {
    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private String text;

    @Builder
    public Search(Long id, String text) {
        this.id = id;
        this.text = text;
    }
}
