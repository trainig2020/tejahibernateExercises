package com.hibernate.main;






import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.model.UserDetails;



public class HibernateTest {

	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Criteria criteria= session.createCriteria(UserDetails.class);
		//criteria.add(Restrictions.eq("userName", "User 6"));
		
		criteria.add(Restrictions.like("userName", "%User 6%"))
				.add(Restrictions.between("userId", 2, 6));
		
		
		
		List<UserDetails> users = (List<UserDetails>)criteria.list();
		
		
		session.getTransaction().commit();
		session.close();
		for(UserDetails u : users){
			System.out.println(u.getUserName());
		}
	
		
		
		

	}

}
