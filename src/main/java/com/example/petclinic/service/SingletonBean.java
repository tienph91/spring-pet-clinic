package com.example.petclinic.service;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a singleton bean");
    }

    public String getMyScope() {
        return "I'm a singleton";
    }
}
