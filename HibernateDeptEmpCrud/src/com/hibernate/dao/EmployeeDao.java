package com.hibernate.dao;

public interface EmployeeDao {
	
	public void insertEmployee();
	public void updateEmployee() ;
	public void getAllRecordsOfEmployee() ;
	public void deleteEmployee(int deptId, int deptId1);
	public void deleteEmployeeByEmpId(int empId);

}
