package com.wxf.dao;

import java.util.List;

import org.hibernate.Session;

import com.wxf.domain.Bill;

public interface BillDao extends BaseDao{

	public  List<Bill> getAllBill(Session session);
	
	public  List<Bill> getAllBillByPage(Session session,int pageNow, int pageSize);
}
