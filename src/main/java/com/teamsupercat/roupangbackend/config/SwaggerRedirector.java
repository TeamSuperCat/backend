package com.teamsupercat.roupangbackend.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/TeamSuperCat")
public class SwaggerRedirector {
    @GetMapping
    public String api() {
        return "redirect:/swagger-ui.html";
    }
}
