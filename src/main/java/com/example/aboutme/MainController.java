package com.example.aboutme;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String homePage(Model model) {
    model.addAttribute("myvar"," monday/november/2017");
        return "Myself";
    }
}
