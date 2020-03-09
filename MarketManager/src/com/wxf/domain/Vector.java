package com.wxf.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Vector implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String  vectorName;
	private String  vectorTel;
	private String  vectorAddress;
	private String  vectorContactPerson;
	private Set<Bill> bills=new HashSet<Bill>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVectorName() {
		return vectorName;
	}
	public void setVectorName(String vectorName) {
		this.vectorName = vectorName;
	}
	public String getVectorTel() {
		return vectorTel;
	}
	public void setVectorTel(String vectorTel) {
		this.vectorTel = vectorTel;
	}
	public String getVectorAddress() {
		return vectorAddress;
	}
	public void setVectorAddress(String vectorAddress) {
		this.vectorAddress = vectorAddress;
	}
	public Set<Bill> getBills() {
		return bills;
	}
	
	public String getVectorContactPerson() {
		return vectorContactPerson;
	}
	public void setVectorContactPerson(String vectorContactPerson) {
		this.vectorContactPerson = vectorContactPerson;
	}
	public void setBills(Set<Bill> bills) {
		this.bills = bills;
	}
	public Vector() {
	}
	
	public Vector(String vectorName, String vectorTel, String vectorAddress,
			String vectorContactPerson, Set<Bill> bills) {
		super();
		this.vectorName = vectorName;
		this.vectorTel = vectorTel;
		this.vectorAddress = vectorAddress;
		this.vectorContactPerson = vectorContactPerson;
		this.bills = bills;
	}
	public Vector(Integer id, String vectorName, String vectorTel,
			String vectorAddress, Set<Bill> bills) {
		super();
		this.id = id;
		this.vectorName = vectorName;
		this.vectorTel = vectorTel;
		this.vectorAddress = vectorAddress;
		this.bills = bills;
	}
	
}
