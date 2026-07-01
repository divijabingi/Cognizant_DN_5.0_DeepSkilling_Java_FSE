package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {

        System.out.println("sayHello() method STARTED");

        System.out.println("sayHello() method COMPLETED");

        return "Hello World!!\n This is my first Spring REST application.";
    }
}