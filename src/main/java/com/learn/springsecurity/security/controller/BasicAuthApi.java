package com.learn.springsecurity.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAuthApi {

    @GetMapping("/get")
    public String getData() {
        return "Hello";
    }
    
}
