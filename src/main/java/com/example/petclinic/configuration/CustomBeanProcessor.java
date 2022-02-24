package com.example.petclinic.configuration;

import com.example.petclinic.controller.I18nGreetingController;
import com.example.petclinic.service.controller.MyController;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof MyController) {
            System.out.println("a");
        } else if (bean instanceof DataSources) {
            System.out.println("a");
        } else if (bean instanceof I18nGreetingController) {
            System.out.println("a");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
