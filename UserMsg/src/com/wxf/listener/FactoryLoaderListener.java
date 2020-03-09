package com.wxf.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.SessionFactory;

import com.wxf.factory.BuildSessionFactory;
import com.wxf.factory.DaoFactory;

public class FactoryLoaderListener implements ServletContextListener {

	DaoFactory df=null;
	SessionFactory sf=null;
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		df=null;
		sf=null;
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		try {
			
			sf=BuildSessionFactory.getSessionFactory();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("初始化sessionFactory工厂出现异常"+e);
		}
		
		try {
			String path=arg0.getServletContext().getRealPath("/WEB-INF/");
			System.out.println(path);
			df=DaoFactory.getInstance(path);
			System.out.println("Dao工厂已被初始化。。。"+df);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("初始化dao工厂时出现异常"+e);
		}
	}

}
