package com.mph.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Address;
import com.mph.entity.Customer;

@Repository
public class AddressDaoImpl implements AddressDao{

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public List<Address> getAllAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddress(Address add) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> updateAddress(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> deleteAddress(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getAddress(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void createAddress(Address address) {
		
		getSession().saveOrUpdate(address);
		System.out.println("Customer address Saved successfully...");
	}

}
