package com.wxf.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Bill implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Date  billDate;
	private Date  billDueDate;
	private Vector vector;
	private int  billAmount;
	private Set<BillItem> billItems=new HashSet<BillItem>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public Date getBillDueDate() {
		return billDueDate;
	}
	public void setBillDueDate(Date billDueDate) {
		this.billDueDate = billDueDate;
	}
	public Vector getVector() {
		return vector;
	}
	public void setVector(Vector vector) {
		this.vector = vector;
	}
	
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	
	public Set<BillItem> getBillItems() {
		return billItems;
	}
	public void setBillItems(Set<BillItem> billItems) {
		this.billItems = billItems;
	}
	public Bill() {
	}
	
	public Bill(Date billDate, Date billDueDate, Vector vector, int billAmount,
			Set<BillItem> billItems) {
		super();
		this.billDate = billDate;
		this.billDueDate = billDueDate;
		this.vector = vector;
		this.billAmount = billAmount;
		this.billItems = billItems;
	}
	public Bill(Integer id, Date billDate, Date billDueDate, Vector vector,
			Set<BillItem> billItems) {
		super();
		this.id = id;
		this.billDate = billDate;
		this.billDueDate = billDueDate;
		this.vector = vector;
		this.billItems = billItems;
	}
	
}
