package com.hexaware.VehicleInsuranceSystem.models;

import jakarta.persistence.*;

@Entity
@Table(name = "policy")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_id")
    private Long id;

    @Column(name = "policy_name", nullable = false)
    private String policyName;

    @Column(name = "description")
    private String description;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "company_description")
    private String companyDescription;

    @Column(name = "active_policy", nullable = false)
    private boolean activePolicy;

    @Column(name = "claims_served")
    private int claimsServed;

    // Constructors, getters, and setters

    public Policy(Long id) {
        this.id = id;
    }

    public Policy() {
    }

    public Policy(String policyName, String description, String company, String companyDescription, boolean activePolicy, int claimsServed) {
        this.policyName = policyName;
        this.description = description;
        this.company = company;
        this.companyDescription = companyDescription;
        this.activePolicy = activePolicy;
        this.claimsServed = claimsServed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public boolean isActivePolicy() {
        return activePolicy;
    }

    public void setActivePolicy(boolean activePolicy) {
        this.activePolicy = activePolicy;
    }

    public int getClaimsServed() {
        return claimsServed;
    }

    public void setClaimsServed(int claimsServed) {
        this.claimsServed = claimsServed;
    }
}
