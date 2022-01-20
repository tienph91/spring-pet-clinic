package com.example.petclinic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("ES")
public class SystemConfig {

    @Bean("mail")
    @Profile("EN")
    public Mail getMail() {
        return new Mail();
    }
}