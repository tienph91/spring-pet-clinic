package com.example.petclinic.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello the world!!!");

        return "Hi";
    }
}
