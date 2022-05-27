package com.warscodev.exoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/user")
    public String join(){
        return "user";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
