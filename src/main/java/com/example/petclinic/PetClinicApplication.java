package com.example.petclinic;

import com.example.petclinic.configuration.Mail;
import com.example.petclinic.controller.*;
import com.example.petclinic.service.InsuranceController;
import com.example.petclinic.service.PrototypeBean;
import com.example.petclinic.service.SingletonBean;
import com.example.petclinic.service.controller.MyController;
import com.example.petclinic.service.controller.PropertyInjectionController;
import com.example.petclinic.service.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;

@ComponentScan(basePackages = {"com.example", "com.example.petclinic"})
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
//        Mail mail = (Mail) applicationContext.getBean("mail");
//        System.out.println(mail.toString());

        System.out.println("----------------------------");
//        Mail mail1 = (Mail) applicationContext.getBean("mail1");
//        System.out.println(mail1.toString());

        System.out.println("----------------------------");
        I18nGreetingController i18nGreetingController = (I18nGreetingController) applicationContext.getBean("i18nGreetingController");
        System.out.println(i18nGreetingController.sayHello());

        System.out.println("----------------------------");
        PetController petController = (PetController) applicationContext.getBean("petController");
        System.out.println(petController.sayHello());

        System.out.println("----------------------------");
        InsuranceController insuranceController = (InsuranceController) applicationContext.getBean("insuranceController");
        insuranceController.claimInsurance();

        System.out.println("----------------------------");
        HelloWorldController helloWorldController = (HelloWorldController) applicationContext.getBean("helloWorldController");
        helloWorldController.helloWorld();

        SingletonBean singletonBean1 = (SingletonBean) applicationContext.getBean("singletonBean");
        SingletonBean singletonBean2 = (SingletonBean) applicationContext.getBean("singletonBean");
        System.out.println(singletonBean1);
        System.out.println(singletonBean2);

        PrototypeBean prototypeBean1 = (PrototypeBean) applicationContext.getBean("prototypeBean");
        PrototypeBean prototypeBean2 = (PrototypeBean) applicationContext.getBean("prototypeBean");
        System.out.println(prototypeBean1);
        System.out.println(prototypeBean2);

    }

}
