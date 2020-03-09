package com.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.config.TxNamespaceHandler;

public class App1 {

	public static void main(String[] args) {
		
		ApplicationContext  ac=new ClassPathXmlApplicationContext("/com/aop1/beans.xml");
		TestServiceInter2 ts=(TestServiceInter2) ac.getBean("proxyFactoryBean");
		ts.sayHello();
		((TestServiceInter1)ts).sayByte();
		
	}
	
}
