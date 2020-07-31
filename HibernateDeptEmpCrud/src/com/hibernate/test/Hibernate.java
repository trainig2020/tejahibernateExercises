package com.hibernate.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
	
	private static SessionFactory sessionFactory;
	 private static SessionFactory buildSessionFactory() {
	  try {
	  
	   SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	   return sessionFactory;
	   
	  } catch(Throwable ex) {
	   ex.printStackTrace();
	   throw new ExceptionInInitializerError(ex);
	  }
	 }
	 
	 public static SessionFactory getSessionFactory() {
	  if(sessionFactory == null) {
	   sessionFactory = buildSessionFactory();
	  }
	  return sessionFactory;
	 }

}
