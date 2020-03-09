package com.wen.domain;

public class User {

	private  String  username;
	private  String  password;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public String getPassword() {
		return password;
	}
	public String getUsername() {
		return username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
}
