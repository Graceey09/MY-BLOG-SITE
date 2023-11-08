package com.example.blogsite.controllers;

import com.example.blogsite.Services.PostService;
import com.example.blogsite.data.Models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class BlogSiteControllers {
    @Autowired
    private PostService postService;

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/posts")
    public List<Post> posts() {
        return PostService.getAllPosts();
    }

    @PostMapping(value = "/post")
    public void publishPost(@RequestBody Post post){
        if(post.getCreatedAt() == null)
            post.setCreatedAt(new Date());
        PostService.insert(post);
    }
}
