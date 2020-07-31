package com.hibernate.main;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		//create and insert
		for(int i=0;i<10;i++){
			UserDetails user = new UserDetails();
			user.setUserName("User"+i);
			session.save(user);
		}
		
		
		/*//retrival
		UserDetails user = (UserDetails)session.get(UserDetails.class, 4);
		System.out.println("User retrived is : "+user.getUserName());
		
		//Update
		UserDetails user = (UserDetails)session.get(UserDetails.class, 4);
		user.setUserName("Updated user");
		session.update(user);
		
		//Delete user
		UserDetails user = (UserDetails)session.get(UserDetails.class, 10);
		System.out.println("User deleted is : "+user.getUserName());*/
		session.getTransaction().commit();
		session.close();
		
		

	}

}
