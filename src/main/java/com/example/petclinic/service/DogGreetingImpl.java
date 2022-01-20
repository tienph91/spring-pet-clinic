package com.example.petclinic.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("petService")
@Profile({"Dog","default"})
public class DogGreetingImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "I am the dog - Hello the world";
    }
}
