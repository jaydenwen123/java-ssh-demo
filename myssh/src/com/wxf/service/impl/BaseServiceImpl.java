package com.wxf.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.wxf.service.inter.BaseServiceInter;

@Transactional
public abstract class BaseServiceImpl implements BaseServiceInter {

	@Resource
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void add(Object obj) {
		
		this.getSessionFactory().getCurrentSession().save(obj);
	}

	public void execute(String hql, Object[] parameters) {
		
		Query query=this.getSessionFactory().getCurrentSession().createQuery(hql);
		if (parameters!=null && parameters.length>0) {
			for (int i = 0; i < parameters.length; i++) {
				query.setParameter(i, parameters[i]);
			}
		}
		query.executeUpdate();
	}

	public List ExecuteQuery(String hql, Object[] parameters) {
		
		Query query=this.getSessionFactory().getCurrentSession().createQuery(hql);
		if(parameters!=null && parameters.length>0){
			for (int i = 0; i < parameters.length; i++) {
				query.setParameter(i, parameters[i]);
			}
		}
		return query.list();
	}

	public Object FindById(Class clazz, Serializable id) {
		return this.getSessionFactory().getCurrentSession().get(clazz, id);
	}

	public List ExecuteQuery(String hql, Object[] parameters, int pageSize,
			int pageNow) {
		Query query=this.getSessionFactory().getCurrentSession().createQuery(hql);
		if(parameters!=null && parameters.length>0){
			for (int i = 0; i < parameters.length; i++) {
				  query.setParameter(i,parameters[i]);
			}
		}
		query.setFirstResult((pageNow-1)*pageSize).setMaxResults(pageSize);
		return query.list();
	}

	public int  getPageCount(String hql,Object[] parameters ,int pageSize){
		Query query =this.getSessionFactory().getCurrentSession().createQuery(hql);
		if(parameters!=null && parameters.length>0){
			for (int i = 0; i < parameters.length; i++) {
				query.setParameter(i, parameters[i]);	
			}
		}
		Object object=query.uniqueResult();
		//»òÕßÓÃInteger.parseInt(object+"");
		return Integer.parseInt(object.toString());
	}
	
	public void update(Object object){
		this.sessionFactory.getCurrentSession().update(object);
	}
	
	
	public void delete(Class clazz,java.io.Serializable id){
		Session session=this.sessionFactory.getCurrentSession();
		session.delete(this.FindById(clazz, id));
	}
}
