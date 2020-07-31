package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Address;
import com.hibernate.model.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserName("Sandhiya");
		
		Address add = new Address();
		add.setStreet("street 1");
		add.setCity("salem");
		add.setState("TamilNadu");
		add.setPincode("636351");
		
		Address add2 = new Address();
		add2.setStreet("street 2");
		add2.setCity("CHENNAI");
		add2.setState("TamilNadu");
		add2.setPincode("636398");
		
		user.setHomeAddress(add);
		user.setOfficeAddress(add2);
		
		//user.setAddress(add);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();

	}

}
