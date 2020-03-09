package com.wxf.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.wxf.dao.DeptDao;
import com.wxf.domain.Dept;

public class DeptDaoImpl extends BaseDaoImpl implements DeptDao{

	public List<Dept> getAllDept(Session session) {
		// TODO Auto-generated method stub
		String hql="from Dept";
		return this.findAll(session, hql);
	}

	public List<Dept> getAllDeptWithPage(Session session, int pageNow,
			int pageSize) {
		// TODO Auto-generated method stub
		String hql="from Dept";
		return this.findAllByPage(session, hql, pageNow, pageSize);
	}

	public Integer getPageCounts(Session session,int pageSize) {
		// TODO Auto-generated method stub
		String hql="select count(*) from Dept";
		return this.PageCount(session, hql, pageSize);
	}

}
