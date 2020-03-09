package com.wxf.service;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.wxf.domain.Message;
import com.wxf.domain.User;

public interface MessageManager {

	public  User  ValidLogin(String username, String password);
	
	public  void   registerUser(User user);
	
	public  void  pubMsg(Message msg);
	
	public  List<Message>  showMsg(java.io.Serializable id,int pageSize,int pageNow);
	
	public  void  updateUser(User user);
	
	public  Message  getMessageById(java.io.Serializable id);
	
	public  void  updateMessage (Message message);
	
	public  void  deleteMessage(java.io.Serializable id);
	
	public  int  getPageCounts(int pageSize,java.io.Serializable id);
	
	public int  getTotalCounts(java.io.Serializable id);
}
