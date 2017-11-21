package com.boot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return ("Das Boot, reporting for duty!");
    }
}
