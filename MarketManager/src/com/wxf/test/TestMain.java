package com.wxf.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wxf.factory.BuildSessionFactory;

public class TestMain {

	public static void main(String[] args) {
		
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			List list=session.createQuery("from User where username=?").setParameter(0, "wen").list();
			System.out.println(list.size());
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
	}
	
}
