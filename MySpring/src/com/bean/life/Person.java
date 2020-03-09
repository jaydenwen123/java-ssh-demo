package com.bean.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Person implements  BeanNameAware,BeanFactoryAware,
	ApplicationContextAware,InitializingBean{

	private  String  name;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name) {
		super();
		this.name = name;
	}
	public void sayHi(){
		System.out.println("hi spring"+   name);
	}
	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("Person.setBeanName()----->"+arg0);
	}
	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Person.setBeanFactory()----->"+arg0);
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Person.setApplicationContext()----->"+arg0);
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Person.afterPropertiesSet()");
	}
	
	public  void init() {
		System.out.println("Person.init()");
	}
	
	
}
