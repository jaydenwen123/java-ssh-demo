package com.wsf.domain;

public class Users {

	private String  username;
	private String  password;
	private String  oldfilename;
	private String  newfilename;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOldfilename() {
		return oldfilename;
	}
	public void setOldfilename(String oldfilename) {
		this.oldfilename = oldfilename;
	}
	public String getNewfilename() {
		return newfilename;
	}
	public void setNewfilename(String newfilename) {
		this.newfilename = newfilename;
	}
	public Users() {
		// TODO Auto-generated constructor stub
	}
	public Users(String username, String password, String oldfilename,
			String newfilename) {
		super();
		this.username = username;
		this.password = password;
		this.oldfilename = oldfilename;
		this.newfilename = newfilename;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(username+","+password+","+oldfilename+","+newfilename);
		return super.toString();
	}
	
}
