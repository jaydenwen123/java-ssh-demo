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
			System.out.println("�Ѿ����daofactory ��serviceFactory �����·��");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��ȡrealpath �������⣬δ����ɳ�ʼ��");
		}
		
		try {
			daoFactory=DaoFactory.getInstance(realpath);
			System.out.println("daoFactory �ѱ���ʼ��...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("daofactory ��ʼ���쳣");
		}
		
		
		try {
			serviceFactory=ServiceFactory.getInstance(realpath);
			System.out.println("serviceFactory �ѱ���ʼ��...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("serviceFactory ��ʼ���쳣");
		}
		
		/*try {
			sessionFactory=BuildSessionFactory.getSessionFactory();
			System.out.println("sessionFactory �ѱ���ʼ��...");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("sessionFactory ��ʼ���쳣");
		}*/
	}
	

}
