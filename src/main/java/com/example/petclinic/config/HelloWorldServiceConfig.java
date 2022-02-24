package com.example.petclinic.config;

import com.example.petclinic.repositories.HelloWorldRepository;
import com.example.petclinic.repositories.HelloWorldRepositoryIml;
import com.example.petclinic.service.HelloWorldENService;
import com.example.petclinic.service.HelloWorldESService;
import com.example.petclinic.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloWorldServiceConfig {

    @Bean
    @Profile("ES")
    HelloWorldService helloWorldESService() {
        return new HelloWorldESService();
    }

    @Bean
    HelloWorldRepository helloWorldRepository() {
        return new HelloWorldRepositoryIml();
    }

    @Bean
    @Profile("EN")
    HelloWorldService helloWorldENService(HelloWorldRepository helloWorldRepository) {
        return new HelloWorldENService(helloWorldRepository);
    }
}
