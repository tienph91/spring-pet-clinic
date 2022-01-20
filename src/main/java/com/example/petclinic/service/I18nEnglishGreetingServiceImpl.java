package com.example.petclinic.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nservice")
@Profile("EN")
public class I18nEnglishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Say hello from English";
    }
}
