package com.example.petclinic.service;

import com.example.petclinic.repositories.HelloWorldRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

public class HelloWorldENService implements HelloWorldService {

    private final HelloWorldRepository helloWorldRepository;

    public HelloWorldENService(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    @Override
    public void helloWorld() {
        System.out.println(helloWorldRepository.getGreeting());
    }
}
