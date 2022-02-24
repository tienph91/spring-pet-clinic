package com.example.petclinic.controller;

import com.example.petclinic.service.PropertyInjectedServiceImpl;
import com.example.petclinic.service.controller.SetterInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller = new SetterInjectedController();

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new PropertyInjectedServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}