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
		
		//PARAMETER BINDING
		
		String minUserId ="5";
		String userName = "user 4";
		Query query = session.createQuery("from UserDetails where userId > :userId and userName = :userName");
		query.setInteger("userId", Integer.parseInt(minUserId));
		query.setString("userName", userName);
		List<UserDetails> users = (List<UserDetails>)query.list();
		
		
		
		/*//Query query = session.createQuery("from UserDetails where userId >6");
		//List users = query.list();
		 * 
		 * 
		Query query = session.createQuery("from UserDetails");
		query.setFirstResult(3); //pagination
		query.setMaxResults(5);  //pagination
		List<UserDetails> users = (List<UserDetails>)query.list();*/
		session.getTransaction().commit();
		session.close();
		//System.out.println("Size is : "+users.size());
		for(UserDetails u : users){
			System.out.println(u.getUserName());
		}
		
		

	}

}
