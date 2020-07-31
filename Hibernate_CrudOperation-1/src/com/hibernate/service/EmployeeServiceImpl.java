package com.hibernate.service;

import java.util.List;

import com.hibernate.dao.EmployeeDao;
import com.hibernate.dao.EmployeeDaoImpl;
import com.hibernate.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao dao = new EmployeeDaoImpl();

	

	@Override
	public void insertEmployee(Employee emp) {
		 dao.insertEmployee(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		 dao.updateEmployee(emp);
	}

	@Override
	public void deleteEmployee(int id) {
		
		 dao.deleteEmployee(id);
	}

	@Override
	public Employee getAllEmployees(int deptId) {

		return dao.getAllEmployees(deptId);
	}

}
