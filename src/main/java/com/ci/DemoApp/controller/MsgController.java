package com.ci.DemoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MsgController {
    @GetMapping
    public String hello() {
        return "Your java app is running perfectly....." ;
    }
}
