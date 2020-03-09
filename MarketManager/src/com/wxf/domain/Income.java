package com.wxf.domain;

import java.io.Serializable;

public class Income implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String  name;
	private Double  money;
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
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Income() {
		// TODO Auto-generated constructor stub
	}
	public Income(Integer id, String name, Double money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}
	public Income(String name, Double money) {
		super();
		this.name = name;
		this.money = money;
	}
	
}
