package com.example.blogsite.dtos;

import lombok.Data;

@Data
public class RegisterAuthorRequest {
    private String name;
    private String password;
}
