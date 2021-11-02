package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloWorldController {
    @GetMapping("/{name}")
    public String nameMessage(@PathVariable String name) {
        return "Hello "+name;
    }

    @GetMapping("/")
    public String worldMessage() {
        return "Hello World";
    }
}
