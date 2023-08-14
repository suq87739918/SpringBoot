package com.yueqian.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" and display "Hello World"
    @GetMapping
    public String sayHello(){
        return "Hello World";
    }

}
