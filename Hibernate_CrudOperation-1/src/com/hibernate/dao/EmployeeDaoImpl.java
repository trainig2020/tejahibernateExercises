package com.hibernate.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.hibernate.model.Employee;
import com.hibernate.util.HibernateUtil;



public class EmployeeDaoImpl implements EmployeeDao{

	

	
	@Override
	public void insertEmployee(Employee emp) {

		Transaction transaction = null;
        try {
        	Session session = HibernateUtil.getSession();
            
            transaction = session.beginTransaction();
            session.save(emp);
            System.out.println("Datas Inserted");
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
	}

	@Override
	public void updateEmployee(Employee emp) {
		
			Session session = HibernateUtil.getSession();
			session.beginTransaction();
			session.update(emp);
			
			
			session.getTransaction().commit();
			session.close();
			
			
		
	}


	@SuppressWarnings("unchecked")
	@Override
	public Employee getAllEmployees(int deptId) {

		Employee emp_det = null;
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
     
        emp_det = (Employee) session.get(Employee.class, deptId);
            
        System.out.println("EmpID  : "+ emp_det.getEmpId()+" EmpName  :"+emp_det.getEmpName()+" Age  : "
        			+ emp_det.getAge()+" DeptId  : "+emp_det.getDeptId());
        
        
        return emp_det;
    

	}

	@SuppressWarnings("unchecked")
	@Override
	public void deleteEmployee(int id) {
		
		 Transaction transaction = null;
	        Employee emp1 = null;
	        try {
	        	Session session = HibernateUtil.getSession() ;
	            
	            transaction = session.beginTransaction();

	            emp1 = (Employee) session.get(Employee.class, id);
	            
	            session.delete(emp1);
	            
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	        }
            
        
	}

	
}
