package com.hibernate.service;

import java.util.List;

import com.hibernate.model.Employee;

public interface EmployeeService {

	
	

	public void insertEmployee(Employee emp);

	public void updateEmployee(Employee emp);

	public void deleteEmployee(int id);

	public Employee getAllEmployees(int deptId);

}
