package com.wen.domain;

public class Rat {

	private  String  name;
	private  int   age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Rat() {
		// TODO Auto-generated constructor stub
	}
	public Rat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
