package com.example.blogsite.data.Repository;

import com.example.blogsite.data.Models.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
