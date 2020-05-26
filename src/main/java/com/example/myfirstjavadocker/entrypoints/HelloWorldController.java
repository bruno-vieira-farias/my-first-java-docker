package com.example.myfirstjavadocker.entrypoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping
    @RequestMapping("/")
    public String handle(){
        return "My first application is running in Docker";
    }

}
