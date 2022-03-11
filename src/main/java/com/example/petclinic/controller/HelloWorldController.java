package com.example.petclinic.controller;

import com.example.petclinic.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class HelloWorldController {

    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void helloWorld() {
        helloWorldService.helloWorld();
    }
}
