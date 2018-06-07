package com.mousbah.recipes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String goToMain(Model model) throws Exception{
        model.addAttribute("message", "Hello!");
        return "index";
    }
}
