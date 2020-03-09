package com.wxf.domain;

import java.util.Set;

public class Department {

	private Integer id;
	private String name;
	private Set<Employee> set;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employee> getSet() {
		return set;
	}
	public void setSet(Set<Employee> set) {
		this.set = set;
	}
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(String name) {
		super();
		this.name = name;
	}
	public Department(String name, Set<Employee> set) {

		this.name = name;
		this.set = set;
	}
	
	
}
