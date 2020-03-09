package com.wxf.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.wxf.domain.User;


public class TestHibernate {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=null;
		Transaction tx=null;
		try {
			session=sessionFactory.openSession();
			System.out.println(session);
			tx=session.beginTransaction();
			User user=new User();
			List list=session.createQuery("from User").list();
			System.out.println(list.size());
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				throw new RuntimeException(e.getMessage());
			}
		}finally{
			
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
	}
	
}
