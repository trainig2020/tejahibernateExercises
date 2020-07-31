package com.hibernate.main;


import com.hibernate.model.Department;
import com.hibernate.model.Employee;
import com.hibernate.service.DepartmentService;
import com.hibernate.service.DepartmentServiceImpl;
import com.hibernate.service.EmployeeService;
import com.hibernate.service.EmployeeServiceImpl;




public class HibernateTest {

	public static void main(String[] args) {
		
		
		DepartmentService deptService = new DepartmentServiceImpl();
		Department dept = new Department();
		
		

		// Create and Insert values into department
		dept.setDeptName("ECE");
		deptService.insertDepartment(dept);
		

		// Get all department details
		 /*System.out.println("Department Details");
		 deptService.getAllDepartments();*/
		 
		

		// Update Department 
		
		/*dept.setDeptName("CSE");
		dept.setDeptId(1);
		System.out.println(deptService.updateDepartment(dept));
		*/

		 

		// Delete Department Based on Id

		
		/*deptService.deleteDepartment(1);
		System.out.println("Details Deleted  ");*/
		
	//**************************************************************//

		EmployeeService employeeService= new EmployeeServiceImpl(); 
		Employee emp = new Employee();

		// Create and Inserting Employees
		
		/*emp.setEmpName("suja");
		emp.setAge(22);
		emp.setDeptId(1);
		employeeService.insertEmployee(emp);
		*/
		  

		// Updating Employee

		/*emp.setEmpName("divya");
		emp.setEmpId(1);
		employeeService.updateEmployee(emp);
		System.out.println("Updated name is : "+ emp.getEmpName());*/

		// Deleting Employee
		
		/*
		employeeService.deleteEmployee(1);
		System.out.println("Details are Deleted  ");
		
		*/

	// get all employees based on department id
        
        /*System.out.println("Employee details are :");
        employeeService.getAllEmployees(2);*/

	}
	
}
