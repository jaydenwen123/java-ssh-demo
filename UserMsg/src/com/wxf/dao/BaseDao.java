package com.wxf.dao;

import java.util.List;

import org.hibernate.Session;

@SuppressWarnings("rawtypes")
public interface BaseDao {

	public void  add(Session s,Object object);
	
	public void  update(Session s,Object object);
	
	public  Object findById(Session s,Class clazz,java.io.Serializable id);
	
	public  List getAll(Session s,String hql);
	
	public  void  delete (Session s,Class clazz, java.io.Serializable id);
	
	public  void  delete (Session s,Object object);
	
	
	public List  findByPage (Session s,String hql,int pageSize, int pageNow);
	
	public int   pageCount(Session s,String hql,int pageSize);
	
	public int  totalCount(Session s,String hql);
}
