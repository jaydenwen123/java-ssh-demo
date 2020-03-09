package com.wxf.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class User implements Serializable {

	private Integer id;
	private String username;
	private String password;
	private String email;
	private Set<Message> set=new HashSet<Message>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Set<Message> getSet() {
		return set;
	}
	public void setSet(Set<Message> set) {
		this.set = set;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public User(Integer id, String username, String password, String email,
			Set<Message> set) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.set = set;
	}
	
	
}
