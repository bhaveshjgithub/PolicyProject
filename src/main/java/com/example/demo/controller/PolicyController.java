package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Policy;
import com.example.demo.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyController {

	@Autowired
	private  PolicyService policyService;

	@GetMapping("/getall")
	
	public List<Policy> getAllPolicy(){
		
		return policyService.getall();
	}
	//http://localhost:8080/policy/create-policy
	@PostMapping("/create-policy")
	public void creatPolicy(@RequestBody Policy policy) {
		policyService.create(policy);
	}
	
	@PutMapping("/update-policy/{id}")
	
	public void updatePolicy(@PathVariable("id") Long id,@RequestBody Policy policy){
		policyService.update(id, policy);
	}
	
	@DeleteMapping("/delete-policy/{id}")
	
	public void deletePolicy(@PathVariable Long id){
		policyService.delete(id);
	}
	
}
