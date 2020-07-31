package com.hibernate.dao;



public interface DepartmentDao {
	
	public void insertDepartment();
	
	public void updateDepartment() ;
	
	public void getAllRecordsOfDepartment();
	
	public void deleteDepartmentByDepId(int deptId);

}
