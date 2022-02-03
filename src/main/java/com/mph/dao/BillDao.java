package com.mph.dao;

import java.util.List;

import com.mph.entity.Bill;

public interface BillDao {

	public void createBill( Bill bill);
	public List<Bill > getAllBill();
	public  Bill getBill( Bill bill);
	public List< Bill> updateBill( Bill bill);
	public List< Bill> deleteBill(int cid);
	public Bill getBill(int id);
}
