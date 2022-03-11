package com.example.petclinic.config;

import com.example.petclinic.repositories.HelloWorldRepository;
import com.example.petclinic.repositories.HelloWorldRepositoryIml;
import com.example.petclinic.service.HelloWorldENService;
import com.example.petclinic.service.HelloWorldESService;
import com.example.petclinic.service.HelloWorldService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@ImportResource("classpath:stfdi-config.xml")
@Configuration
public class HelloWorldServiceConfig {
}
