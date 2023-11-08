package com.example.blogsite.Services;

import com.example.blogsite.data.Models.Post;
import com.example.blogsite.data.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService{
    @Autowired
    private PostRepository postRepository;
    public static List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public static void insert(Post post) {
        postRepository.save(post);
    }
}
