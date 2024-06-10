package com.hibernatetutorial.annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {

//	 System.out.println(HibernateUtility.getSessionfactory());
		SessionFactory factory = HibernateUtility.getSessionfactory();
	 AddressUitil addressUitil = new AddressUitil();
	 addressUitil.setAddress("Thane");
	 EmployeeUtil employeeUtil = new EmployeeUtil();
	 employeeUtil.setName("Sid");
	 employeeUtil.setAddressUitil(addressUitil);
	 
	 Session openSession = factory.openSession();
	 Transaction beginTransaction = openSession.beginTransaction();
	 openSession.save(addressUitil);
	 openSession.save(employeeUtil);
	 beginTransaction.commit();
	 openSession.close();
	 factory.close();
	 

	}

}
