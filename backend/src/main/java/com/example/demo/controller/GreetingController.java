package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("greetings")
public class GreetingController {
    List<String> greetings = Arrays.asList(
            "Hello World",
            "Привет мир",
            "ciao mondo",
            "Hallo Welt",
            "Bonjour le Monde",
            "مرحبا بالعالم",
            "שלום עולם",
            "नमस्ते दुनिया"
            );

    @Autowired
    public GreetingController() { }

    @GetMapping
    public List<String> list() {
        return greetings;
    }

    @GetMapping("{id}")
    public String getOne(@PathVariable("id") String greeting) {
        return greeting;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") String greeting) {
        greetings.remove(greeting);
    }
}
