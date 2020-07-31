package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.FourWheeler;
import com.hibernate.model.TwoWheeler;

import com.hibernate.model.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {
		
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Bike");
		
		TwoWheeler bike = new TwoWheeler();
		bike.setVehicleName("TVS");
		bike.setSteeringHandle("Bike steerting");
		
		FourWheeler car = new FourWheeler();
		car.setVehicleName("benz");
		car.setSteeringWheel("Car steering");
		
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		session.save(vehicle);
		session.save(bike);
		session.save(car);
		
		session.getTransaction().commit();
		session.close();


	}

}
