package com.mentoria.helena.confeitaria.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWorldControler {
    @GetMapping
    public String helloWorld(){
        String hello;
        hello="Hello world!";
        return hello;
    }
    @GetMapping("/hello")
    public String hello(){
        String hello;
        hello="Hello world!";
        return hello;
    }
    @GetMapping("/oi")
    public String oi(){
        String hello;
        hello="Hello world!";
        return hello;
    }

}
