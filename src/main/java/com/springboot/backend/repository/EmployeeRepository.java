package com.springboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.backend.model.Employee;

//no need to add @Repository as JpaRepository already implements that in SimpleJpaRepository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
