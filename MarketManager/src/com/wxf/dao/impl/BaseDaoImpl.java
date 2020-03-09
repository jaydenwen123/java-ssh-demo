package com.wxf.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.management.Query;

import org.hibernate.Session;

import com.wxf.dao.BaseDao;

public class BaseDaoImpl  implements BaseDao{

	public Object findById(Session session, Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return session.get(clazz, id);
	}

	public Object findByName(Session session,String hql, String name) {
		// TODO Auto-generated method stub
		org.hibernate.Query query=session.createQuery(hql);
		List<Object> list= query.setParameter(0, name).list();
		if(list.size()==1){
			return list.get(0);
		}
		return null;
	}

	public <E> List<E> findAll(Session session,String hql) {
		// TODO Auto-generated method stub
		return session.createQuery(hql).list();
	}

	public <E> List<E> findAllByPage(Session session,String hql, int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		return session.createQuery(hql).setFirstResult((pageNow-1)*pageSize).
				setMaxResults(pageSize).list();
	}

	public void add(Session session, Object object) {
		// TODO Auto-generated method stub
		session.save(object);
	}

	public void update(Session session, Object object) {
		// TODO Auto-generated method stub
		session.update(object);
	}

	public void delete(Session session, Object object) {
		// TODO Auto-generated method stub
		session.delete(object);
	}

	public void deleteById(Session session,Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		session.delete(this.findById(session, clazz, id));
	}

	public Integer PageCount(Session session,String hql,int pageSize) {
		// TODO Auto-generated method stub
		Object object=session.createQuery(hql).uniqueResult();
		Integer counts=Integer.parseInt(object.toString());
		Integer pageCounts=(counts-1)/pageSize+1;
		return pageCounts;
	}

}
