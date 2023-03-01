package com.practice.commento.dto;

import lombok.*;

@Data
@ToString
public class Dto {
    private Long id;
    private String title;
    private String content;
    private String writer;

    @Builder
    public Dto(Long id, String title, String content, String writer) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
}
