package com.example.Lab.Resource.Utilization.Platform.Group2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @GetMapping("/")
    public String hello() {
        return "Hello! Welcome to Lab Resource Utilization Platform";
    }
}