package com.autowired;

public class Master {

	private  String name;
	private  Dog dog;

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Master() {
		// TODO Auto-generated constructor stub
	}

	public Master(String name, Dog dog) {
		super();
		this.name = name;
		this.dog = dog;
	}

	public Master(String name) {
		super();
		this.name = name;
	}
	
	
}
