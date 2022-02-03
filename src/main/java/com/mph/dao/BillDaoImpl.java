package com.mph.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Bill;

@Repository
public class BillDaoImpl implements BillDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void createBill(Bill bill) {
		getSession().saveOrUpdate(bill);
		System.out.println("Customer address Saved successfully...");
	}

	@Override
	public List<Bill> getAllBill() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill getBill(Bill bill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bill> updateBill(Bill bill) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bill> deleteBill(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill getBill(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
