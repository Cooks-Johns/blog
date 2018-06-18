package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }
    @GetMapping("/protfolio")
    public String portfolio () {
        return "portfolio";
    }
//    @GetMapping("/example")
//    public @ResponseBody example(){
//        return "JSON in a string";
//    }
}