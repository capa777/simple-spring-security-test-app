package com.capa.springsecurityapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
    @GetMapping("/test")
    public String sayHello(){
        return "test";
    }

    @GetMapping("/testadmin")
    public String sayHello2(){
        return "testadmin";
    }

}
