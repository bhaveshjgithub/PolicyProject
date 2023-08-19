package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_table")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 private String policyName;
	 private Integer policyAge;
	 private String policyDes;
	 
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
	public Integer getPolicyAge() {
		return policyAge;
	}
	public void setPolicyAge(Integer policyAge) {
		this.policyAge = policyAge;
	}
	public String getPolicyDes() {
		return policyDes;
	}
	public void setPolicyDes(String policyDes) {
		this.policyDes = policyDes;
	}
	 

}
