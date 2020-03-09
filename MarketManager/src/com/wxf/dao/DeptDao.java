package com.wxf.dao;

import java.util.List;

import org.hibernate.Session;

import com.wxf.domain.Dept;

public interface DeptDao extends BaseDao{

	public List<Dept> getAllDept(Session session);
	
	public List<Dept> getAllDeptWithPage(Session session ,int pageNow, int pageSize);
	
	public Integer  getPageCounts(Session session,int pageSize);
}
