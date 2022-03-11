package com.example.petclinic.service;

public class HelloWorldServiceFactory {

    public HelloWorldService getHelloWoldService(String type) {
        switch (type) {
            case "EN":
                return new HelloWorldENService(null);
            case "ES":
                return new HelloWorldESService();
            default:
                return null;
        }
    }
}
