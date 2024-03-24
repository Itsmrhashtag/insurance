package com.hexaware.VehicleInsuranceSystem.services;

import com.hexaware.VehicleInsuranceSystem.dtos.PolicyDto;
import com.hexaware.VehicleInsuranceSystem.models.Policy;
import com.hexaware.VehicleInsuranceSystem.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    public Policy createPolicy(PolicyDto policyDto) {
        Policy policy = new Policy();
        policy.setPolicyName(policyDto.getPolicyName());
        policy.setDescription(policyDto.getDescription());
        policy.setCompany(policyDto.getCompany());
        policy.setCompanyDescription(policyDto.getCompanyDescription());
        policy.setActivePolicy(policyDto.isActivePolicy());
        policy.setClaimsServed(policyDto.getClaimsServed());
        return policyRepository.save(policy);
    }

    public Policy changePolicyStatus(Long policyId, boolean newStatus) {
        Policy policy = policyRepository.findById(policyId).orElse(null);
        if (policy != null) {
            policy.setActivePolicy(newStatus);
            return policyRepository.save(policy);
        }
        return null; // or throw an exception if policy with the given ID is not found
    }
    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }
}