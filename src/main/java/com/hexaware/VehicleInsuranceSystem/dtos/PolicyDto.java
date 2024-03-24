package com.hexaware.VehicleInsuranceSystem.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PolicyDto {

    private String policyName;
    private String description;
    private String company;
    private String companyDescription;
    private boolean activePolicy;
    private int claimsServed;


}
