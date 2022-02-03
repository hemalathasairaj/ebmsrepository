package com.mph.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Address {

	@Id
	private int doorno;

	@Column
	private String street;
	private String city;
	private int pincode;
	private String state;
	
	@ManyToOne
	@JoinColumn(name = "cid",referencedColumnName = "CID")
	public Customer customer;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int doorno, String street, String city, int pincode, String state, Customer customer) {
		super();
		this.doorno = doorno;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.customer = customer;
	}

	public int getDoorno() {
		return doorno;
	}

	public void setDoorno(int doorno) {
		this.doorno = doorno;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", street=" + street + ", city=" + city + ", pincode=" + pincode
				+ ", state=" + state + ", customer=" + customer + "]";
	}
	
	
}
