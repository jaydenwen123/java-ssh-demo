package com.wxf.dao;

import java.util.List;

import org.hibernate.Session;

import com.wxf.domain.BillItem;

public interface BillItemDao extends BaseDao{

	public List<BillItem> getAllBillItem(Session session);
	
	public List<BillItem> getAllBillItemWithPage(Session session ,int pageNow, int pageSize);
}
