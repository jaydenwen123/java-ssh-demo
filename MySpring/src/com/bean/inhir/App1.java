package com.bean.inhir;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	public static void main(String[] args) {
		
		ApplicationContext  ac=new ClassPathXmlApplicationContext("/com/bean/inhir/beans.xml");
		Graduate graduate=(Graduate) ac.getBean("graduate");
		System.out.println(graduate.getNoCard());
		System.out.println(graduate.getAge());
		System.out.println(graduate.getDegree());
		
	}
	
}
