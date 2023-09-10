package com.example.hellospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServicesController {
    @GetMapping("/rest")
    public String sayREST() {
        return "Let's take a REST with Spring Boot!";
    }
}
