package com.bean.inhir;

public class Student {

	private  String  noCard;
	private  int   age;
	public String getNoCard() {
		return noCard;
	}
	public void setNoCard(String noCard) {
		this.noCard = noCard;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String noCard, int age) {
		super();
		this.noCard = noCard;
		this.age = age;
	}
	
	
}
