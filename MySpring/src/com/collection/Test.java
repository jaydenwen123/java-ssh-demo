package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("/com/collection/applicationContext.xml");
		Department d=(Department) ac.getBean("department");
		System.out.println(d.getName());
		for(String emp:d.getEmpName()){
			
			System.out.println(emp);
		}
		System.out.println("*****************************************");
		for(Employee emp:d.getEmpList()){
			System.out.println(emp.getName());
		}
		System.out.println("*****************************************");
		for(Employee emp:d.getEmpSet()){
			System.out.println(emp.getName());
		}
		System.out.println("******************************************");
		for(Entry<String, Employee> entry:d.getEmpMap().entrySet()){
			System.out.println(entry.getKey()+","+entry.getValue().getName());
		}
		System.out.println("I******************************************");
		for(String set:d.getEmpMap().keySet()){
			System.out.println(set+","+d.getEmpMap().get(set).getName());
		}
		System.out.println("******************************************");
		Iterator<String> iter=d.getEmpMap().keySet().iterator();
		while (iter.hasNext()) {
			System.out.println(d.getEmpMap().get(iter.next()).getName());
			
		}
		System.out.println("*****************************************");
		Properties pp=d.getPp();
		Enumeration en=pp.keys();
		while(en.hasMoreElements()){
			
//			System.out.println(en.nextElement()+","+pp.getProperty((String) en.nextElement()));
			String key=(String) en.nextElement();
			
			System.out.println(key+","+pp.getProperty(key));
		}
	}
	
}
