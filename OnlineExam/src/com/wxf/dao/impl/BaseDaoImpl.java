package com.wxf.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.wxf.dao.BaseDao;
import com.wxf.dao.StudentDao;
import com.wxf.dao.TeacherDao;
import com.wxf.domain.Teacher;

@Transactional
public  class BaseDaoImpl extends HibernateDaoSupport implements BaseDao {

	public void add(Object object) {
		// TODO Auto-generated method stub
		 this.getHibernateTemplate().save(object);
	}

	public void update(Object object) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(object);
	
	}

	public void delete(Object object) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(object);
	}

	public void deleteById(Class clazz,Serializable id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(this.findById(clazz, id));
	}

	public Object findById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(clazz, id);
	}

	public <T> List<T> findAll(String hql) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find(hql);
	}

	public <T> List<T> findAllWithPage(final String hql,final Object[] obj,final int pageSize,
		final int pageNow) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<T> list=this.getHibernateTemplate().executeFind(new HibernateCallback() {
			public Object doInHibernate(Session arg0) throws HibernateException,
					SQLException {
				// TODO Auto-generated method stub
				org.hibernate.Query query=arg0.createQuery(hql);
				if(obj!=null && obj.length>0){
					for(int i=0;i<obj.length;i++){
						query.setParameter(i, obj[i]);
					}
				}
				List result=query.setFirstResult((pageNow-1)*pageSize).setMaxResults(pageSize).list();
				return result;
			}
		});
		return list;
	}
	
	
}
