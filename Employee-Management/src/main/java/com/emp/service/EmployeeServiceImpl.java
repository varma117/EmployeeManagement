package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.exception.ResourceNotFoundException;
import com.emp.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	IEmployeeRepository employeeRepository;
	
	@Override
	public Integer saveEmployee(Employee employee) {
		Employee savedEmployee = employeeRepository.save(employee);
		return savedEmployee.getId();
		
	}
	@Override
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	@Override
	public Optional<Employee> getEmployee(Integer id) {
		
		return employeeRepository.findById(id);
	}
	@Override
	public void deleteEmployee(Integer id) {
		
		employeeRepository.deleteById(id);
	}
	@Override
	public void deleteAllEmployees() {
	employeeRepository.deleteAll();
		
	}
	@Override
	public Employee updateEmployee(Employee employee, Integer id) {
		// checking for emp exits or not
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
		()-> new ResourceNotFoundException("Employee","id", id)	);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		//we will update the value and save
		employeeRepository.save(existingEmployee);
		
		return existingEmployee;
	}

}
