package com.wxf.domain;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer  id;
	private String  title;
	private String  content;
	private Date  pubDate;
	private User user;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Message() {
		// TODO Auto-generated constructor stub
	}
	public Message(Integer id, String title, String content, Date pubDate,
			User user) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.pubDate = pubDate;
		this.user = user;
	}
	
}
