package com.dispatch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.life.Person;

public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac=new ClassPathXmlApplicationContext("/com/dispatch/beans.xml");
		DbUtil dbUtil=(DbUtil) ac.getBean("dbUtil");
		System.out.println(dbUtil.getPassword());
		
	}
}
