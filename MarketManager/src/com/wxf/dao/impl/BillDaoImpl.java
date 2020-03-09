package com.wxf.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.wxf.dao.BillDao;
import com.wxf.domain.Bill;

public class BillDaoImpl extends BaseDaoImpl implements BillDao{

	public List<Bill> getAllBill(Session session) {
		// TODO Auto-generated method stub
		return this.findAll(session, "from Bill");
		
	}

	public List<Bill> getAllBillByPage(Session session, int pageNow,
			int pageSize) {
		// TODO Auto-generated method stub
		return this.findAllByPage(session, "from Bill", pageNow, pageSize);
	}

}
