package com.hibernatetutorial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class Hiber {

	public static void main(String[] args) throws FileNotFoundException {
		
		Sample sample = new Sample(2, "sid", "ghanekar", "random", "male");
		
		Session session =  Helper.getfac().openSession();
		Transaction tx = session.beginTransaction();
		session.save(sample);
		tx.commit();
		
		Query<Sample> query = session.createQuery("from Sample");
		List<Sample> list= query.list();
		for (Sample s : list) {
			System.out.println(s.toString());
		}
		session.close();

		//==============================================
		
		
		
	}

}
