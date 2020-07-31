package com.hibernate.service;

import java.util.List;

import com.hibernate.dao.DepartmentDao;
import com.hibernate.dao.DepartmentDaoImpl;
import com.hibernate.model.Department;


public class DepartmentServiceImpl implements DepartmentService{
	
	DepartmentDao dao = new DepartmentDaoImpl();

	

	@Override
	public void insertDepartment(Department dept) {
		 dao.insertDepartment(dept);
	}

	@Override
	public List<Department> getAllDepartments() {
		
		return dao.getAllDepartments();
	}

	@Override
	public String updateDepartment(Department dept) {
		return dao.updateDepartment(dept);
	}

	@Override
	public void deleteDepartment(int deptId) {
		 dao.deleteDepartment(deptId);
	}


}
