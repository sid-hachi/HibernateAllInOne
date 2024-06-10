package com.hibernatetutorial.annotations.OnetoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {

//	 System.out.println(HibernateUtility.getSessionfactory());
		SessionFactory factory = HibernateUtility.getSessionfactory();

		EmployeeUtil employeeUtil = new EmployeeUtil();

		AddressUitil addressUitil = new AddressUitil();
		addressUitil.setAddress("Thane");
		addressUitil.setType("permanent");
		addressUitil.setEmployeeUtil(employeeUtil);
		AddressUitil addressUitil1 = new AddressUitil();
		addressUitil1.setAddress("Dombivli");
		addressUitil1.setType("office");
		addressUitil1.setEmployeeUtil(employeeUtil);
		List<AddressUitil> list = new ArrayList<AddressUitil>();
		list.add(addressUitil1);
		list.add(addressUitil);

		employeeUtil.setName("Sid");
		employeeUtil.setListadd(list);

		Session openSession = factory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		openSession.save(addressUitil);
		openSession.save(addressUitil1);
		openSession.save(employeeUtil);
		beginTransaction.commit();
		openSession.close();
		factory.close();

	}

}
