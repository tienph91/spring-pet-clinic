package com.example.petclinic.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
public class CatGreetingImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "I am the cat - Hello";
    }
}
