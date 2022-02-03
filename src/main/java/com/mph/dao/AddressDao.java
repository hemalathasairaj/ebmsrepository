package com.mph.dao;

import java.util.List;

import com.mph.entity.Address;

public interface AddressDao {

	public void createAddress( Address address);
	public List<Address > getAllAddress();
	public  Address getAddress( Address add);
	public List< Address> updateAddress( Address address);
	public List< Address> deleteAddress(int cid);
	public   Address getAddress(int id);
}
