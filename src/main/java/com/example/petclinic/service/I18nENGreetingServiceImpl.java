package com.example.petclinic.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile({"EN", "default"})
public class I18nENGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello from English";
    }
}
