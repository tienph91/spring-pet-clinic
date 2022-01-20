package com.example.petclinic;

import com.example.petclinic.configuration.Mail;
import com.example.petclinic.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetClinicApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(PetClinicApplication.class, args);

        MyController myController = applicationContext.getBean(MyController.class);
        MyController myController1 = (MyController) applicationContext.getBean("myController");

        myController.sayHello();
        myController1.sayHello();

        System.out.println(myController);
        System.out.println(myController1);

        System.out.println("----------------------------");
        PropertyInjectionController propertyInjectionController = (PropertyInjectionController) applicationContext.getBean("propertyInjectionController");
        System.out.println(propertyInjectionController.getGreeting());

        System.out.println("----------------------------");
        SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("----------------------------");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());

        System.out.println("----------------------------");
        Mail mail = (Mail) applicationContext.getBean("mail");
        System.out.println(mail.toString());

        System.out.println("----------------------------");
        I18nGreetingController i18nGreetingController = (I18nGreetingController) applicationContext.getBean("i18nGreetingController");
        System.out.println(i18nGreetingController.sayHello());

        System.out.println("----------------------------");
        PetController petController = (PetController) applicationContext.getBean("petController");
        System.out.println(petController.sayHello());
    }

}
