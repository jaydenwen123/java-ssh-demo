/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.wxf.struts.form;

import org.apache.struts.action.ActionForm;

/** 
 * MyEclipse Struts
 * Creation date: 07-18-2016
 * 
 * XDoclet definition:
 * @struts.form name="studentForm"
 */
public class StudentForm extends ActionForm {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String stuName;
	private String stuNo;
	private String stuPhone;
	private String stuMail;
	private String humanid;
	private String className;
	private String address;
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public String getStuMail() {
		return stuMail;
	}
	public void setStuMail(String stuMail) {
		this.stuMail = stuMail;
	}
	public String getHumanid() {
		return humanid;
	}
	public void setHumanid(String humanid) {
		this.humanid = humanid;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}