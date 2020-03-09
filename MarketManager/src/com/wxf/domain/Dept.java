package com.wxf.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Dept implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String deptName;
	private String description;
	private Set<BillItem> billItems=new HashSet<BillItem>();
	private Income income;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<BillItem> getBillItems() {
		return billItems;
	}
	public void setBillItems(Set<BillItem> billItems) {
		this.billItems = billItems;
	}
	
	public Income getIncome() {
		return income;
	}
	public void setIncome(Income income) {
		this.income = income;
	}
	public Dept() {
		// TODO Auto-generated constructor stub
	}
	public Dept(String deptName, String description, Set<BillItem> billItems) {
		super();
		this.deptName = deptName;
		this.description = description;
		this.billItems = billItems;
	}
	
	
	
}
