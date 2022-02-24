package com.example.petclinic.service.controller;

import com.example.petclinic.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Autowired
    @Qualifier("propertyInjectedServiceImpl")
    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
