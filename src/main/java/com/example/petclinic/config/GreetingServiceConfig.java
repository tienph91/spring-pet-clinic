package com.example.petclinic.config;

import com.example.petclinic.service.ConstructorInjectedGreetingServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorInjectedGreetingServiceImpl constructorInjectedGreetingService() {
        return new ConstructorInjectedGreetingServiceImpl();
    }
}
