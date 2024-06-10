package com.hibernatetutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTutorial {

	public static void main(String[] args) throws IOException {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
//		Employee employee = new Employee(101, "siddhesh", 10000);
//		Session openSession = factory.openSession();
////		Transaction tx = openSession.beginTransaction();
////		openSession.save(employee);
////		tx.commit();
//		Employee employee2 = openSession.get(Employee.class, 1);
//		System.out.println(employee2.toString());
//		openSession.close();
		
		FileInputStream stream = new FileInputStream(new File("C:\\Users\\Sghanekar\\Documents\\capture.png"));
		byte[] bs = new byte[stream.available()];
		
		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		Address address = new Address();
		address.setStreet("zxcvbnm");
		address.setCity("Dombivli");
		Date date = new Date();
		address.setImage(bs);
		address.setDate(date);
		address.setXyz(19);
		openSession.save(address);
		beginTransaction.commit();
		openSession.close();
		
	}

}
