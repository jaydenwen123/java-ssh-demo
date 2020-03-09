package com.wxf.dao;

import java.util.List;

import org.hibernate.Session;

public interface BaseDao {
	
	public Object findById(Session session,Class clazz, java.io.Serializable id);
	
	public Object findByName(Session session,String hql,String name);
	
	public <E> List<E> findAll(Session session,String hql);
	
	public  <E> List<E> findAllByPage(Session session,String hql,int pageNow,int pageSize);
	
	public void add( Session session,Object object);
	
	public  void  update(Session session ,Object object);
	
	public  void  delete(Session session, Object object);
	
	public  void  deleteById(Session session,Class clazz,java.io.Serializable id);
	
	public  Integer  PageCount(Session session,String hql,int pageSize);
	
}
