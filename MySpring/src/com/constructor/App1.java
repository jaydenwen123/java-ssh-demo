package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext  ac=new  ClassPathXmlApplicationContext("/com/constructor/beans.xml");
		Employee employee=(Employee) ac.getBean("emp");
		System.out.println(employee.getSalary());
		
	}

}
