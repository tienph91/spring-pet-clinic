package com.example.petclinic2;

import com.example.petclinic.service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("petService")
@Profile("Cat")
public class CatGreetingImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "I am the cat - Hello";
    }
}
