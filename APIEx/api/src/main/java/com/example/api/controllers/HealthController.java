package com.example.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public String getHealth() {
        return "I'm Okay!";
    }

}
