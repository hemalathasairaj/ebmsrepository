package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.BillDao;
import com.mph.dao.CustomerDao;
import com.mph.entity.Bill;

@Repository
@Transactional
public class BillServiceImpl implements BillService{

	@Autowired 
	public BillDao billDao;
	@Autowired
	public CustomerDao customerDao;
	
	@Override
	public void createBill(Bill bill) {
		billDao.createBill(bill);
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
