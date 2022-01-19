package com.example.petclinic.controller;

import com.example.petclinic.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired
    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
