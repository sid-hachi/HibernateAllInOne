package com.hibernatetutorial.annotations.OnetoMany.HQLExample;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class App {

	public static void main(String[] args) {
		
		SessionFactory sessionfactory = HibernateUtility.getSessionfactory();
		Session openSession = sessionfactory.openSession();
		Query createQuery = openSession.createQuery("from Student where age=:age");
		createQuery.setParameter("age", 18);
		List<Student> list = createQuery.list();
		for(Student st : list) {
			System.out.println(st);
		}
		openSession.close();
		sessionfactory.close();
	}

}
