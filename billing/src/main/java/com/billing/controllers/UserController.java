package com.billing.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping()
    public String test(){
        return "index";
    }
    @PostMapping("/register")
    public ResponseEntity register(){
        return ResponseEntity.ok().build();
    }
}
