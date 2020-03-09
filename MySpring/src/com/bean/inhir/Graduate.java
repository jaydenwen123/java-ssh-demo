package com.bean.inhir;

public class Graduate extends  Student{

	private  String  degree;

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	
	public Graduate() {
		// TODO Auto-generated constructor stub
	}

	public Graduate(String degree) {
		super();
		this.degree = degree;
	}
	
}
