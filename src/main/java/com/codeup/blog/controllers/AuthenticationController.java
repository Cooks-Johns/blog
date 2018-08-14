package com.codeup.blog.controllers;

import com.codeup.blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {
    private final UserRepository userRepository;

    @GetMapping("/login")
    public String showLoginForm() {
        return "users/login";
    }

    @Autowired
    public AuthenticationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

}