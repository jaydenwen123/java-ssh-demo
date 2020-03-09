package com.wxf.struts.form;

import java.util.Date;

import org.apache.struts.action.ActionForm;

import com.wxf.domain.User;

public class MessageForm  extends  ActionForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1029295213421815090L;
	
	private String title;
	private String content;
	private Date  pubDate;
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	
	
}
