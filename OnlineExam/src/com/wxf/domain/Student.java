package com.wxf.domain;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer id;
	private String stuNo;
	private String stuName;
	private String className;
	private String stuMail;
	private String humanid;
	private String address;
	private String stuPhone;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String stuNo) {
		this.stuNo = stuNo;
	}

	/** full constructor */
	public Student(String stuNo, String stuName, String className,
			String stuMail, String humanid, String address, String stuPhone) {
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.className = className;
		this.stuMail = stuMail;
		this.humanid = humanid;
		this.address = address;
		this.stuPhone = stuPhone;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStuNo() {
		return this.stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getStuMail() {
		return this.stuMail;
	}

	public void setStuMail(String stuMail) {
		this.stuMail = stuMail;
	}

	public String getHumanid() {
		return this.humanid;
	}

	public void setHumanid(String humanid) {
		this.humanid = humanid;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStuPhone() {
		return this.stuPhone;
	}

	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}

}