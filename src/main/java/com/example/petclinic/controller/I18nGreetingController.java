package com.example.petclinic.controller;

import com.example.petclinic.service.GreetingService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

@Controller
public class I18nGreetingController implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    private final GreetingService greetingService;

    public I18nGreetingController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(this);
    }

    @Override
    public void setBeanName(String name) {
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(this);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(this);
    }
}
