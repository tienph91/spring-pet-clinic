package com.example.petclinic.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nservice")
@Profile("ES")
public class I18nSpanishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola, hombre";
    }
}
