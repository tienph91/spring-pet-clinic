package com.example.petclinic.controller;

import com.example.petclinic.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    private MyController myController;

    private String str;

    private int i;

    @Autowired
    private PetController petController;

    @Autowired
    public ConstructorInjectedController(@Qualifier("abc") GreetingService greetingService) {
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
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
