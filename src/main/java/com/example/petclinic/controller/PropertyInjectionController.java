package com.example.petclinic.controller;

import com.example.petclinic.service.GreetingService;

public class PropertyInjectionController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
