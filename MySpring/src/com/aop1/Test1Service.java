package com.aop1;

public class Test1Service implements TestServiceInter1,TestServiceInter2 {

	private  String  name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Test1Service() {
	}

	public Test1Service(String name) {
		super();
		this.name = name;
	}

	@Override
	public void sayHello() {
		System.out.println("hello"+name);
	}

	@Override
	public void sayByte() {
		// TODO Auto-generated method stub
		System.out.println("byte"+name);
	}

}
