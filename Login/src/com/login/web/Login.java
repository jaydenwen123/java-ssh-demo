package com.login.web;
public class Login 
{
	private String userId;
	private String password;
	private int salary;
	public void setUserId(String userId)
	{
		this.userId=userId;
	}
	public String getUserId()
	{
		return this.userId;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
