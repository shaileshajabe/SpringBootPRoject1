package com.example.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeemanagement.model.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;

@Service
public class service {
   @Autowired
   private EmployeeRepository employeeRepository;
   public Employee createEmployee(Employee employee) {
	   return employeeRepository.save(employee);
   }
   public Optional<Employee> getEmployeeById(long id){
	   return employeeRepository.findById(id);
   }
   public List<Employee> getAllEmployees(){
	   return employeeRepository.findAll();
   }
   
}
