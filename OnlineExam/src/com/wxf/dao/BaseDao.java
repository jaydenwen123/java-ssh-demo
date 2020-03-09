package com.wxf.dao;

import java.util.List;

import com.sun.istack.internal.FinalArrayList;

public interface BaseDao {

	public  void  add(Object object);
	
	public  void  update(Object object);
	
	public  void  delete(Object object);
	
	public  void  deleteById(Class clazz,java.io.Serializable id);
	
	public  Object findById(Class clazz,java.io.Serializable id);
		
	public <T> List<T> findAll(String hql);
	
	public <T> List<T> findAllWithPage(final String hql,final Object[] obj,final int pageSize,
			final int pageNow);
}
