package com.example.petclinic.service.controller;

import com.example.petclinic.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("ZZZ")
public class PetController {

    private final GreetingService greetingService;

    public PetController(@Qualifier("petService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
