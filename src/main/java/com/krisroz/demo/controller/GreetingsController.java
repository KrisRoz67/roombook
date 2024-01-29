package com.krisroz.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingsController {

    @GetMapping
    public String greeting() {
        return "Hello from Spring";
    }

    @GetMapping("/v2")
    public String greeting2() {

        return "Hello from Spring2 ";
    }
}

