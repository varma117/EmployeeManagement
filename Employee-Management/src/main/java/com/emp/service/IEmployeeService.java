package com.emp.service;

import java.util.List;
import java.util.Optional;

import com.emp.model.Employee;

public interface IEmployeeService {

	//Integer saveEmployee(Employee employee);

	Integer saveEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	
	Optional<Employee> getEmployee(Integer id);
	public void  deleteEmployee(Integer id);
	
	public void deleteAllEmployees();
	
	Employee updateEmployee(Employee employee, Integer id);

}
