package com.example.blogsite.data.Repository;

import com.example.blogsite.data.Models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
//    List<Post> findPostByAuthorId(String authorId);
}
