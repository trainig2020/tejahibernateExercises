package com.hibernate.dao;

import java.sql.PreparedStatement;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hibernate.model.Department;
import com.hibernate.test.Hibernate;

public class DepartmentDaoImpl implements DepartmentDao {

	SessionFactory sessionFactory = Hibernate.getSessionFactory();

	     public void insertDepartment() {
		Department department = new Department();
		Transaction transaction = null;
		Session session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();

			department.setDeptName("CSE");
			
			session.save(department);
			
			transaction.commit();
			System.out.println("Table created and values are inserted");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void updateDepartment() {

		Transaction transaction = null;
		Session session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			Department department = new Department();
			department = (Department) session.get(Department.class, 1);
			department.setDeptName("Mech");
            System.out.println("Values are upated");
			session.update(department);
			transaction.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	

	public void getAllRecordsOfDepartment() {

		Transaction transaction = null;
		Session session = sessionFactory.openSession();
		try {

			transaction = session.beginTransaction();

			CriteriaBuilder builder = ((Object) session).getCriteriaBuilder();
			CriteriaQuery<Department> criteria = builder.createQuery(Department.class);
			Root<Department> customerRoot = criteria.from(Department.class);
			List<Department> departments = session.createQuery(criteria.select(customerRoot)).getResultList();
            System.out.println("Department values are......");
			for (Department department : departments) {

				System.out.println("Department Id :" + department.getDeptId() + " |  Department Name : "
						+ department.getDeptName());
			}

			transaction.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void deleteDepartmentByDepId(int deptId) {

		Transaction transaction = null;
		Session session = sessionFactory.openSession();

		try {
			transaction = session.beginTransaction();
			Department dept = (Department) session.get(Department.class, deptId);
			session.delete(dept);
            
			transaction.commit();
			System.out.println("Department with give id is deleted");

		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
