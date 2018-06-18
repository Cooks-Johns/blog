package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class MyFirstController {

    @Controller
    class HelloCountroller {
        @GetMapping("/hello")
        @ResponseBody
        public String hello() {
            return "Hello from Spring!";
        }
    }
}
