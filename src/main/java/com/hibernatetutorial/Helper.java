package com.hibernatetutorial;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Helper {
	private static SessionFactory factory = null;
	public static SessionFactory getfac() {
		if(factory == null) {
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}
	
	public void closecon() {
		if(factory.isOpen()) {
			factory.close();
		}
	}

}
