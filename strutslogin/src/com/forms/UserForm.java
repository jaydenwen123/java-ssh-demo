package com.forms;

import javax.mail.search.StringTerm;

import org.apache.struts.action.ActionForm;

public class UserForm extends  ActionForm {

	private  String  username;
	private  String  password;
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
	public UserForm(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public UserForm() {
		// TODO Auto-generated constructor stub
	}
	
}
