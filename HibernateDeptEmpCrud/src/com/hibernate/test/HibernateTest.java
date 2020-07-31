package com.hibernate.test;


import com.hibernate.service.DepartmentService;
import com.hibernate.service.DepartmentServiceImpl;
import com.hibernate.service.EmployeeService;
import com.hibernate.service.EmployeeServiceImpl;

public class HibernateTest {

	public static void main(String[] args) {

		DepartmentService deptService = new DepartmentServiceImpl();

		EmployeeService empService = new EmployeeServiceImpl();

		System.out.println("creating table and inserting department");
		deptService.insertDepartment();

		System.out.println("Updating department Name");
		// deptService.updateDepartment();

		System.out.println("Fetching all department details");
		// deptService.getAllRecordsOfDepartment();

		System.out.println("Deleting Department records based on deptId");

		// deptService.deleteDepartmentByDepId(1);

		System.out.println("creating table and inserting Employee values");
		// empService.insertEmployee();

		System.out.println("Updating Employee Details");
		// empService.updateEmployee();

		System.out.println("Fetching all department details");

		//empService.getAllRecordsOfEmployee();

		System.out.println("Deleting records");

		//empService.deleteEmployee(2, 2);

		System.out.println("Deleting records based on empId");

		empService.deleteEmployeeByEmpId(4);

	}

}
