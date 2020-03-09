package com.aop2;

public class ServiceImpl1  implements  ServiceInter{

	private  String  name;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ServiceImpl1() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ServiceImpl1(String name) {
		super();
		this.name = name;
	}

	@Override
	public void sayHi1() {
		System.out.println("ServiceImpl1.sayHi1()"+name);
		
	}

	@Override
	public void sayHi2() {

		System.out.println("ServiceImpl1.sayHi2()"+name);
		
	}


	
	
	
	
}
