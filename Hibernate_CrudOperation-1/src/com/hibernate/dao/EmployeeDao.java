package com.hibernate.dao;

import java.util.List;

import com.hibernate.model.Employee;



public interface EmployeeDao {
	

	public void insertEmployee(Employee emp);

	public void updateEmployee(Employee emp);

	public void deleteEmployee(int id);

	public Employee getAllEmployees(int id);


}
