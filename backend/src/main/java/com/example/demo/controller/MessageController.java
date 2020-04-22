package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("greeting")
public class MessageController {
    private List<String> greetings = Arrays.asList("Hi", "Привет", "Salut");

    @GetMapping
    public List<String> list() {
        return greetings;
    }
}
