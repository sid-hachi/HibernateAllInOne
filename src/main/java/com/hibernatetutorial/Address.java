package com.hibernatetutorial;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="Address_hiber_squad")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "STREET",length = 50)
	private String street;
	@Column(name = "CITY",length = 100)
	private String city;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Lob
	private byte[] image;
	@Transient
	private int xyz;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	public int getXyz() {
		return xyz;
	}
	public void setXyz(int xyz) {
		this.xyz = xyz;
	}
	public Address(int id, String street, String city, Date date, byte[] image,int xyz) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.date = date;
		this.image = image;
		this.xyz = xyz;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", date=" + date + ", image="
				+ Arrays.toString(image) + "]";
	}
	
	
}
