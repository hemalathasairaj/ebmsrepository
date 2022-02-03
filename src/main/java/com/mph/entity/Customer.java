package com.mph.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	@Column
	private String fullname;
	private String email;
	private String password;
	private int phone;

	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	private List<Address>address;

	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	private List<Bill>bill;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String fullname, String email, String password, int phone, List<Address> address) {
		super();
		this.cid = cid;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<Bill> getBill() {
		return bill;
	}

	public void setBill(List<Bill> bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", fullname=" + fullname + ", email=" + email + ", password=" + password
				+ ", phone=" + phone + ", address=" + address + ", bill=" + bill + "]";
	}
	
	
}
