package com.example.petclinic.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectionControllerTest {

    PropertyInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectionController();
        // controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}