package com.example.demo.service;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Policy;
import com.example.demo.repo.PolicyRepository;

@Service
public class PolicyServiceImpl implements PolicyService {
@Autowired
private PolicyRepository policyRepository;
	@Override
	public List<Policy> getall() {
		
		return (List<Policy>) policyRepository.findAll();
	}
	@Override
	public void create(Policy policy) {
		policyRepository.save(policy);
		
	}
	@Override
	public void update(Long id, Policy policy) {
		Optional<Policy> policyData = policyRepository.findById(id);
		if(policyData.isPresent()) {
			Policy existingPolicy = policyData.get();	
			existingPolicy.setPolicyName(policy.getPolicyName());
			existingPolicy.setPolicyAge(policy.getPolicyAge());
			existingPolicy.setPolicyDes(policy.getPolicyDes());	
			policyRepository.save(existingPolicy);
		}
		
	}
	@Override
	public void delete(Long id) {
		policyRepository.deleteById(id);
		
	}
}
