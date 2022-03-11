package com.example.petclinic.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"1","default1"})
public class DogGreetingImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "I am the dog - Hello the world";
    }
}
