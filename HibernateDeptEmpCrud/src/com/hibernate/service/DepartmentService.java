package com.hibernate.service;

import com.hibernate.model.Department;

public interface DepartmentService {
	

	public void insertDepartment();
	
	public void updateDepartment() ;
	
	public void getAllRecordsOfDepartment();
	
	public void deleteDepartmentByDepId(int deptId);

}
