package com.wxf.dao.impl;

import java.util.List;

import org.hibernate.Session;

import sun.nio.cs.ext.TIS_620;

import com.wxf.dao.BillItemDao;
import com.wxf.domain.BillItem;

public class BillItemDaoImpl extends BaseDaoImpl implements BillItemDao{

	public List<BillItem> getAllBillItem(Session session) {
		// TODO Auto-generated method stub
		String hql="from BillItem";
		return this.findAll(session, hql);
	}

	public List<BillItem> getAllBillItemWithPage(Session session, int pageNow,
			int pageSize) {
		// TODO Auto-generated method stub
		String  hql="from BillItem";
		return this.findAllByPage(session, hql, pageNow, pageSize);
	}

}
