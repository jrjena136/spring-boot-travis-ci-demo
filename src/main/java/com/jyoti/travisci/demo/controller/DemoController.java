package com.jyoti.travisci.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String getMessage() {
        return "Welcome to Travis CI";
    }
}
