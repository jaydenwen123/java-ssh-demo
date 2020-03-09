package com.wxf.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Examtype entity. @author MyEclipse Persistence Tools
 */

public class Examtype implements java.io.Serializable {

	// Fields

	private Integer id;
	private String testtitle;
	private Timestamp testtime;
	//private Set questions = new HashSet(0);

	// Constructors

	/** default constructor */
	public Examtype() {
	}

	/** minimal constructor */
	public Examtype(String testtitle) {
		this.testtitle = testtitle;
	}

	/** full constructor */
	public Examtype(String testtitle, Timestamp testtime, Set questions) {
		this.testtitle = testtitle;
		this.testtime = testtime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTesttitle() {
		return this.testtitle;
	}

	public void setTesttitle(String testtitle) {
		this.testtitle = testtitle;
	}

	public Timestamp getTesttime() {
		return this.testtime;
	}

	public void setTesttime(Timestamp testtime) {
		this.testtime = testtime;
	}

	/*public Set getQuestions() {
		return this.questions;
	}

	public void setQuestions(Set questions) {
		this.questions = questions;
	}*/

}