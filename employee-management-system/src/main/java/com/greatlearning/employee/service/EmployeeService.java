package com.greatlearning.employee.service;

import java.util.List;

import com.greatlearning.employee.entity.Employee;

public interface EmployeeService {

	    
		List<Employee> getAllEmployee();
		
		Employee saveEmployee(Employee employee);
		
		Employee getEmployeeById(long id);
		
		Employee updateEmployee(Employee employee);
		
		void deleteEmployeeById(long id);
}
