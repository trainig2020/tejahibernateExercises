package com.hibernate.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Department;
import com.hibernate.model.Employee;
import com.hibernate.test.Hibernate;

public class EmployeeDaoImpl implements EmployeeDao {

	SessionFactory sessionFactory = Hibernate.getSessionFactory();

	public void insertEmployee() {
		Employee emp = new Employee();
		Department dept = new Department();
		dept.setDeptId(1);
		Transaction transaction = null;
		Session session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();

			emp.setEmployeeName("Jansi");
			emp.setAddress("Tirupur");
			emp.setJoinDate(new Date(2019 - 1900, 04 - 1, 10));
			emp.setDepartment(dept);
			session.save(emp);
			transaction.commit();
			System.out.println("Tables are created and values are inserted");

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public void updateEmployee() {

		Employee emp = new Employee();
		Department dept = new Department();
		dept.setDeptId(2);
		Transaction transaction = null;
		Session session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();

			emp = (Employee) session.get(Employee.class, 3);

			emp.setAddress("Coimbatore");
			emp.setEmployeeName("jansirani");
			emp.setDepartment(dept);

			session.update(emp);
			transaction.commit();
			System.out.println("Values are updated");

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void getAllRecordsOfEmployee() {

		Transaction transaction = null;
		Session session = sessionFactory.openSession();
		try {

			transaction = session.beginTransaction();
			String sql = "SELECT * FROM EMPLOYEE WHERE deptId= :deptId";
			SQLQuery query = session.createSQLQuery(sql);
			query.addEntity(Employee.class);
			query.setParameter("deptId", 2);
			List results = query.list();
			System.out.println(results);
			transaction.commit();
			System.out.println("Employee details are fetched based on department id");

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public void deleteEmployee(int deptId, int deptId1) {

		Transaction transaction = null;
		Session session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();

			List<Employee> employees = session.createQuery("from Employee where deptId = :deptId")
					.setParameter("deptId", deptId).list();
			for (Employee emp : employees) {
				session.delete(emp);
			}
			Department dept = (Department) session.get(Department.class, deptId1);
			session.delete(dept);

			transaction.commit();
			System.out.println("employee records are deleted");

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deleteEmployeeByEmpId(int empId) {

		Transaction transaction = null;
		Session session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			Employee emp = (Employee) session.get(Employee.class, empId);
			session.delete(emp);

			transaction.commit();
			System.out.println("employee records are deleted");

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {

			session.close();
		}
	}

}
