package com.example.petclinic.repositories;

public class HelloWorldRepositoryIml implements HelloWorldRepository{
    @Override
    public String getGreeting() {
        return "Hello world";
    }
}
