package com.wxf.domain;

import java.io.Serializable;

public class BillItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Bill bill;
	private Dept dept;
	private Double billItemAmount;
	public BillItem() {
		// TODO Auto-generated constructor stub
	}
	
	public BillItem(Integer id, Bill bill, Dept dept, Double billItemAmount) {
		super();
		this.id = id;
		this.bill = bill;
		this.dept = dept;
		this.billItemAmount = billItemAmount;
	}

	public Integer getId() {
		return id;
	}
	public BillItem(Bill bill, Dept dept, Double billItemAmount) {
		super();
		this.bill = bill;
		this.dept = dept;
		this.billItemAmount = billItemAmount;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Double getBillItemAmount() {
		return billItemAmount;
	}
	public void setBillItemAmount(Double billItemAmount) {
		this.billItemAmount = billItemAmount;
	}
	
}
