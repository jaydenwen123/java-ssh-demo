/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.wxf.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import sun.security.util.Password;

/** 
 * MyEclipse Struts
 * Creation date: 06-28-2016
 * 
 * XDoclet definition:
 * @struts.form name="userForm"
 */
public class UserForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** username property */
	private String username;

	/** email property */
	private String email;

	/** userid property */
	private String userid;

	/*
	 * Returns the username.
	 * @return String
	 */
	public String getUsername() {
		return username;
	}

	/** 
	 * Set the username.
	 * @param username The username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/** 
	 * Returns the email.
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/** 
	 * Set the email.
	 * @param email The email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/** 
	 * Returns the userid.
	 * @return String
	 */
	public String getUserid() {
		return userid;
	}

	/** 
	 * Set the userid.
	 * @param userid The userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		ActionErrors errors=new ActionErrors();
		if(userid==null || userid.equals("")){
			errors.add("userid", new ActionMessage("error.userid", "用户ID"));
		}
		if(username==null || username.equals("")){
			errors.add("username", new ActionMessage("error.username", "用户名"));
		}
		if(email==null || email.equals("")){
			errors.add("email", new ActionMessage("error.email", "邮箱"));
		}
		return errors;
	}
}