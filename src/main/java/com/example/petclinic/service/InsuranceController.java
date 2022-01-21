package com.example.petclinic.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class InsuranceController {

    private final InsuranceService insuranceService;

    public InsuranceController(@Qualifier("healthInsuranceServiceImpl") InsuranceService insuranceService) {
        this.insuranceService = insuranceService;
    }

    public void claimInsurance() {
        insuranceService.processClaim();
    }
}
