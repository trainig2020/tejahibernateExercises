package com.hibernate.main;






import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.UserDetails;



public class HibernateTest {

	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		//Query query= session.getNamedQuery("UserDetails.byId");
		//query.setInteger(0, 1);
		
		Query query= session.getNamedQuery("UserDetails.byName");
		query.setString(0, "User 5");
		List<UserDetails> users = (List<UserDetails>)query.list();
		
		
		session.getTransaction().commit();
		session.close();
	
		for(UserDetails u : users){
			System.out.println(u.getUserName());
		}
		
		

	}

}
