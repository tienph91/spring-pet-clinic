package com.example.petclinic.service;

import org.springframework.stereotype.Service;

public class HelloWorldESService implements HelloWorldService {

    @Override
    public void helloWorld() {
        System.out.println("Hello world by ES");
    }
}
