package com.example.blogsite.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PostRequest {
    private long authorId;
    private String title;
    private String content;
    private LocalDate createdAt = LocalDate.now();

}
