package com.hibernate.dao;

import java.util.List;

import com.hibernate.model.Department;

public interface DepartmentDao {
	

		public void insertDepartment(Department dept);

		public List<Department> getAllDepartments();
		
		public String updateDepartment(Department dept);
		
		public void deleteDepartment(int deptId);

	

}
