package com.emp.employeecontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.IEmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	IEmployeeService employeeService;
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@PostMapping("/employee")
	Integer createEmployee(@RequestBody Employee employee)
	{
		Integer Id = employeeService.saveEmployee(employee);
		System.out.println(Id);
		
		return Id;
	}
	
	@GetMapping("/allemployees")
	List<Employee> getEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/getemployee/{id}")
		Optional<Employee> getEmployee(@PathVariable Integer id){
			Optional<Employee> employee = employeeService.getEmployee(id);
			return employee;
		}
	}
	


