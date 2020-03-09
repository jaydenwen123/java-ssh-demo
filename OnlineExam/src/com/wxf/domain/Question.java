package com.wxf.domain;

/**
 * Question entity. @author MyEclipse Persistence Tools
 */

public class Question implements java.io.Serializable {

	// Fields

	private Integer id;
	//private Examtype examtype;
	private String qutitle;
	private String quhard;
	private String qutype;
	private String selectOption;
	private String quAnswer;
	private Integer quscore;

	// Constructors

	/** default constructor */
	public Question() {
	}

	/** minimal constructor */
	public Question(Examtype examtype, String qutitle, String quhard,
			String qutype, String quAnswer, String selectOption) {
		this.qutitle = qutitle;
		this.quhard = quhard;
		this.qutype = qutype;
		this.quAnswer = quAnswer;
		this.selectOption = selectOption;
	}

	/** full constructor */
	public Question(Examtype examtype, String qutitle, String quhard,
			String qutype, Integer quscore, String quAnswer, String selectOption) {
		this.qutitle = qutitle;
		this.quhard = quhard;
		this.qutype = qutype;
		this.quscore = quscore;
		this.quAnswer = quAnswer;
		this.selectOption = selectOption;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/*public Examtype getExamtype() {
		return this.examtype;
	}

	public void setExamtype(Examtype examtype) {
		this.examtype = examtype;
	}*/

	public String getQutitle() {
		return this.qutitle;
	}

	public void setQutitle(String qutitle) {
		this.qutitle = qutitle;
	}

	public String getQuhard() {
		return this.quhard;
	}

	public void setQuhard(String quhard) {
		this.quhard = quhard;
	}

	public String getQutype() {
		return this.qutype;
	}

	public void setQutype(String qutype) {
		this.qutype = qutype;
	}

	public Integer getQuscore() {
		return this.quscore;
	}

	public void setQuscore(Integer quscore) {
		this.quscore = quscore;
	}

	public String getQuAnswer() {
		return this.quAnswer;
	}

	public void setQuAnswer(String quAnswer) {
		this.quAnswer = quAnswer;
	}

	public String getSelectOption() {
		return this.selectOption;
	}

	public void setSelectOption(String selectOption) {
		this.selectOption = selectOption;
	}

}