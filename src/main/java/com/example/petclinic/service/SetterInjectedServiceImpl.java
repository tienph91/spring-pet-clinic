package com.example.petclinic.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world from Setter Injection";
    }
}
