package com.example.petclinic.service;

import org.springframework.stereotype.Service;

@Service
public class HealthInsuranceServiceImpl implements InsuranceService {

    @Override
    public void processClaim() {
        System.out.println("Health OKE");
    }
}
