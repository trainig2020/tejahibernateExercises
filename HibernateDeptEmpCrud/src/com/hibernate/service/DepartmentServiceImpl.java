package com.hibernate.service;

import com.hibernate.dao.DepartmentDao;
import com.hibernate.dao.DepartmentDaoImpl;
import com.hibernate.model.Department;

public class DepartmentServiceImpl implements DepartmentService {
	
	DepartmentDao dao = new DepartmentDaoImpl();

	@Override
	public void insertDepartment() {
		dao.insertDepartment();
		
	}

	@Override
	public void updateDepartment() {
		dao.updateDepartment();
		
	}

	@Override
	public void getAllRecordsOfDepartment() {
		dao.getAllRecordsOfDepartment();
	}

	@Override
	public void deleteDepartmentByDepId(int deptId) {
		dao.deleteDepartmentByDepId(deptId);
		
	}

}
