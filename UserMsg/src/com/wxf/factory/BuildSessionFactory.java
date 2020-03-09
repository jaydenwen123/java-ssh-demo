package com.wxf.factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class BuildSessionFactory {
	
	private static SessionFactory  sessionFactory=null;
	private  static ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
	private BuildSessionFactory() {
	}
	
	static {
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void setSessionFactory(SessionFactory sessionFactory) {
		BuildSessionFactory.sessionFactory = sessionFactory;
	}

	public  static Session getCurrentSession(){
		Session session=threadLocal.get();
		if(session==null){
			session=sessionFactory.getCurrentSession();
			threadLocal.set(session);
		}
		return session;
	}
	
	public  static Session openSession(){
		return sessionFactory.openSession();
	}

}
