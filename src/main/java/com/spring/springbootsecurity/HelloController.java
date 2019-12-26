package com.spring.springbootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping("/admin")
    public String admin() {
        return "welcome admin";
    }

    @GetMapping("/user")
    public String user() {
        return "welcome user";
    }
}
