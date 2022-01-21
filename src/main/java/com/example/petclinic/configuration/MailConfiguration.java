package com.example.petclinic.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"ES", "default"})
public class MailConfiguration {

    @Bean("mail")
    public Mail getMail() {
        return new Mail();
    }

    @Bean("mail1")
    public Mail getMail1() {
        return new Mail();
    }
}