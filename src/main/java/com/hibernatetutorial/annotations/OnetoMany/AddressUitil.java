package com.hibernatetutorial.annotations.OnetoMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class AddressUitil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Address;
	private String type;
	@ManyToOne
	private EmployeeUtil employeeUtil;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public EmployeeUtil getEmployeeUtil() {
		return employeeUtil;
	}
	public void setEmployeeUtil(EmployeeUtil employeeUtil) {
		this.employeeUtil = employeeUtil;
	}
	
	
}
