package com.example.petclinic.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world from Constructor injection";
    }
}
