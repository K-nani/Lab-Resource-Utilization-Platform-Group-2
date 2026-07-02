package com.example.Lab.Resource.Utilization.Platform.Group2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello, your app is running!";
    }
}
