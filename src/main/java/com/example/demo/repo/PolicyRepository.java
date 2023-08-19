package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Policy;
//@Repository
public interface PolicyRepository extends CrudRepository<Policy, Long> {

}
