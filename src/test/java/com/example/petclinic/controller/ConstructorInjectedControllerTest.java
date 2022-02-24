package com.example.petclinic.controller;

import com.example.petclinic.service.PropertyInjectedServiceImpl;
import com.example.petclinic.service.controller.ConstructorInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new PropertyInjectedServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}