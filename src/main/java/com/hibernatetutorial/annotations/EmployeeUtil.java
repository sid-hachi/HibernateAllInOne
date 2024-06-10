package com.hibernatetutorial.annotations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmployeeUtil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToOne
	private AddressUitil addressUitil;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressUitil getAddressUitil() {
		return addressUitil;
	}
	public void setAddressUitil(AddressUitil addressUitil) {
		this.addressUitil = addressUitil;
	}
	
}
