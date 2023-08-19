package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Policy;

public interface PolicyService {
	
	List<Policy> getall();
	
	void create(Policy policy);
	
	void update(Long id, Policy policy);
	
	void delete(Long id);
	 

}
