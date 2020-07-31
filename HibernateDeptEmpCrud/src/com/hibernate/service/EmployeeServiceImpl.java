package com.hibernate.service;

import com.hibernate.dao.EmployeeDao;
import com.hibernate.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao empDao = new EmployeeDaoImpl();

	@Override
	public void insertEmployee() {
		empDao.insertEmployee();

	}

	@Override
	public void updateEmployee() {
		empDao.updateEmployee();

	}

	@Override
	public void getAllRecordsOfEmployee() {
		empDao.getAllRecordsOfEmployee();

	}

	@Override
	public void deleteEmployee(int deptId, int deptId1) {
		empDao.deleteEmployee(deptId, deptId1);

	}

	@Override
	public void deleteEmployeeByEmpId(int empId) {
		empDao.deleteEmployeeByEmpId(empId);

	}

}
