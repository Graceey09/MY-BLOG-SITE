package com.example.blogsite.Services;

import com.example.blogsite.data.Models.Post;
import com.example.blogsite.data.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;
    @Override
    public List<Post> getAllPosts() {
        return null;
    }

    @Override
    public void insert(Post post) {

    }
}
