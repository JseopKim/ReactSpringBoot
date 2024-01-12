package com.example.reactspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactSpringbootController {

    @GetMapping("/api/data")
    public String test() {
        return "Hello, World!";
    }
}
