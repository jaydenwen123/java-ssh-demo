package com.wxf.domain;

import java.util.Date;

public class Employee {

	private Integer id;
	private String  name;
	private String password;
	private String  email;
	private Date  hireDate;
	private Double salary;
	private Integer grade;
	private Department department;
	
	
	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getGrade() {
		return grade;
	}


	public void setGrade(Integer grade) {
		this.grade = grade;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String password, String email, Date hireDate,
			Double salary, Integer grade) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.hireDate = hireDate;
		this.salary = salary;
		this.grade = grade;
	}


	public Employee(Integer id, String name, String password, String email,
			Date hireDate, Double salary, Integer grade, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.hireDate = hireDate;
		this.salary = salary;
		this.grade = grade;
		this.department = department;
	}


	public Employee(String name, String password, String email, Date hireDate,
			Double salary, Integer grade, Department department) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.hireDate = hireDate;
		this.salary = salary;
		this.grade = grade;
		this.department = department;
	}


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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
}
