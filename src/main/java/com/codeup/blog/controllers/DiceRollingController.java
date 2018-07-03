package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class DiceRollingController {


        @GetMapping("/roll-dice/n")
        public String showGame() {
            return "roll-dice";
        }

        @GetMapping("/roll-dice/{guess}")
        public String roll(@PathVariable int guess, Model model) {
            int randoNum = (int)(Math.random() * 6 + 1);
            boolean res = (guess == randoNum);
            model.addAttribute("result", res);
            model.addAttribute("number", randoNum);
            return "dice-outcome";
        }

}
