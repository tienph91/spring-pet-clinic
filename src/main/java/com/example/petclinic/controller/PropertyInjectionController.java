package com.example.petclinic.controller;

import com.example.petclinic.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("abc")
public class PropertyInjectionController {

@Controller
public class PropertyInjectionController {

    @Qualifier("propertyInjectedServiceImpl")
    @Autowired
    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
