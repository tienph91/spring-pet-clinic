package com.example.petclinic.configuration;

import com.example.petclinic.controller.MyController;
import com.example.petclinic.controller.PetController;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DataSources implements InitializingBean, DisposableBean {

    private String str;

    private int age;

    @Autowired
    private MyController myController;

    private final PetController petController;

    public DataSources(PetController petController) {
        this.petController = petController;
    }

    @PostConstruct
    public String getMe() {
        return "abc";
    }

    @PreDestroy
    public String getMe1() {
        return "abc";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this);
    }
}
