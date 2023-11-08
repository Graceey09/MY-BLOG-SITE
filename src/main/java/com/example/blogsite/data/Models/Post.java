package com.example.blogsite.data.Models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String authorId;
    public Post(){
    }
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
