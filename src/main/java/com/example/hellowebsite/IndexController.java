package com.example.hellowebsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Welcome Page";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
