package com.example.petclinic.service;

import org.springframework.stereotype.Service;

@Service
public class VehicleInsuranceServiceImpl implements InsuranceService {

    @Override
    public void processClaim() {
        System.out.println("Vehicle OKE");
    }
}
