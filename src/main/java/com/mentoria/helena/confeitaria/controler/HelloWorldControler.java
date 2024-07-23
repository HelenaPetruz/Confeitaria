package com.mentoria.helena.confeitaria.controler;

import com.mentoria.helena.confeitaria.service.DataHora;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    public DataHora dataHora;
    @GetMapping("/data-hora")
    public String dataHoraAtual(){
        return dataHora.dataHoraAtual();
    }
}
