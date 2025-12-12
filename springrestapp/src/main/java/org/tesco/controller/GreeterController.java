package org.tesco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/api/hello
@RestController
public class GreeterController {

    //apis
    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello Spring!";
    }

    //dynamic url
    //http://localhost:8080/api/hello/yourname
    @GetMapping("/api/hello/{name}")
    public String sayHelloFor(@PathVariable String name) {
        return "Hello!" + name;
    }
}
