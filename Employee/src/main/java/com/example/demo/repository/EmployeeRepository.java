package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface EmployeeRepository extends CrudRepository<com.example.demo.entity.Employee, Integer>{


	
}
