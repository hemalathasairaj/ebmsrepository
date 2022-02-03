package com.mph.entity;

//import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bill {

	@Id
	private int billnumber;

	private LocalDateTime readingdate;
	private LocalDateTime duedate;
	public String connection;
	private int unitsused;
	private int amount;

	@ManyToOne
	@JoinColumn(name = "cid", referencedColumnName = "CID")
	public Customer customer;

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(int billnumber, LocalDateTime readingdate, LocalDateTime duedate, int unitsused, int amount, Customer customer,
			String connection) {
		super();
		this.billnumber = billnumber;
		this.readingdate = readingdate;
		this.duedate = duedate;
		this.connection = connection;
		this.unitsused = unitsused;
		this.amount = amount;
		this.customer = customer;
	}

	public int getBillnumber() {
		return billnumber;
	}

	public void setBillnumber(int billnumber) {
		this.billnumber = billnumber;
	}

	public LocalDateTime getReadingdate() {
		return readingdate;
	}

	public void setReadingdate(LocalDateTime readingdate) {
		LocalDateTime readingdate1 =LocalDateTime.now();
		this.readingdate = readingdate1;
	}

	public LocalDateTime getDuedate() {
		return duedate;
	}

	public void setDuedate(LocalDateTime duedate) {
		LocalDateTime  duedate1=LocalDateTime.now().plusDays(30);
		this.duedate = duedate1;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}

	public int getUnitsused() {
		return unitsused;
	}

	public void setUnitsused(int unitsused) {
		this.unitsused = unitsused;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Bill [billnumber=" + billnumber + ", readingdate=" + readingdate + ", duedate=" + duedate
				+ ", connection=" + connection + ", unitsused=" + unitsused + ", amount=" + amount + ", customer="
				+ customer + "]";
	}

}
