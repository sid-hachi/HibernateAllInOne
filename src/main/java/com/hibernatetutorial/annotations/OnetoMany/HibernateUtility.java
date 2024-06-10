package com.hibernatetutorial.annotations.OnetoMany;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateUtility {

	private static SessionFactory factory ;
	
	public static SessionFactory getSessionfactory() {
		if(factory == null) {
			Configuration cf = new Configuration();
			Properties properties = new Properties();
			properties.put(Environment.DRIVER , "com.mysql.jdbc.Driver");
			properties.put(Environment.URL , "jdbc:mysql://localhost:3306/myhiber");
			properties.put(Environment.USER , "root");
			properties.put(Environment.PASS , "root");
			properties.put(Environment.DIALECT , "org.hibernate.dialect.MySQL5Dialect");
			properties.put(Environment.SHOW_SQL , true);
			properties.put(Environment.HBM2DDL_AUTO , "create");
			cf.setProperties(properties);
			cf.addAnnotatedClass(EmployeeUtil.class);
			cf.addAnnotatedClass(AddressUitil.class);
			ServiceRegistry build = new StandardServiceRegistryBuilder().applySettings(cf.getProperties()).build();
			factory = cf.buildSessionFactory(build);
		}
		
		return factory;
	}

}
