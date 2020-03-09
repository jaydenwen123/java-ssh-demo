package com.wxf.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.wxf.factory.BuildSessionFactory;
import com.wxf.factory.DaoFactory;
import com.wxf.factory.ServiceFactory;

public class FactoryLoaderListener implements ServletContextListener {
	
	private  String  realpath=null;
	private  DaoFactory daoFactory=null;
	private  ServiceFactory serviceFactory=null;
	private  SessionFactory sessionFactory=null;
	
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		daoFactory=null;
		serviceFactory=null;
		sessionFactory=null;
	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		try {
			realpath=arg0.getServletContext().getRealPath("/WEB-INF/");
			System.out.println("已经获得daofactory 和serviceFactory 的相对路径");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("获取realpath 出现问题，未能完成初始化");
		}
		
		try {
			daoFactory=DaoFactory.getInstance(realpath);
			System.out.println("daoFactory 已被初始化...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("daofactory 初始化异常");
		}
		
		
		try {
			serviceFactory=ServiceFactory.getInstance(realpath);
			System.out.println("serviceFactory 已被初始化...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("serviceFactory 初始化异常");
		}
		
		/*try {
			sessionFactory=BuildSessionFactory.getSessionFactory();
			System.out.println("sessionFactory 已被初始化...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("sessionFactory 初始化异常");
		}*/
	}
	

}
