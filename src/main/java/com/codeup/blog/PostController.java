package com.codeup.blog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

public class PostController {


    @GetMapping("/posts")
    public @ResponseBody String index() {
        return "Here are all of the ads! ";
    }

    @GetMapping("/post/{id}")
    public @ResponseBody String showDetails(@PathVariable long id) {
        return "View post #" + id;
    }
    @GetMapping("/post/{id}/edit")
    public @ResponseBody String edit(@PathVariable long id) {
        return "View your form for editing post #" + id;
    }
    @GetMapping("/post/create")
    public @ResponseBody String create(@PathVariable long id) {
        return "View the form for creating a post" + id;

    }
}
