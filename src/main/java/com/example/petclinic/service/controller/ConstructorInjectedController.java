package com.example.petclinic.service.controller;

import com.example.petclinic.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    @Value("${value.from.file}")
    private String valueFromFile;

    private GreetingService greetingService;

    private MyController myController;

    private String str;

    private int i;

    @Autowired
    private PetController petController;

    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
        i = 1;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setMyController(MyController myController) {
        this.myController = myController;
    }

    @Autowired
    public void setGreetingService(@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
