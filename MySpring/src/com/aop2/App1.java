package com.aop2;

import javax.swing.SpinnerDateModel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop1.TestServiceInter1;
import com.aop1.TestServiceInter2;

public class App1 {

	public static void main(String[] args) {
		
		ApplicationContext  ac=new ClassPathXmlApplicationContext("/com/aop2/beans.xml");
		ServiceInter si=(ServiceInter) ac.getBean("proxyFactoryBean");
		si.sayHi1();
		si.sayHi2();
	}
	
}
