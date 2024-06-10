package com.hibernatetutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchTut {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.get(Employee.class, 1);
		Employee _byget = session.get(Employee.class, 1);
		session.close();
		Session session2 = factory.openSession();
		Employee load = session2.load(Employee.class, 1);
		System.out.println("--------------");
		System.out.println("getting values from LOAD :"+ load.getName());
		session2.close();
	}

}
