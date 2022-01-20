package com.example.petclinic.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("ES")
public class I18nESGreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello from Spain";
    }
}
