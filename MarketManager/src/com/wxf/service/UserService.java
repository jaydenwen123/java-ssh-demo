package com.wxf.service;

import java.util.List;

import com.wxf.domain.User;


public interface UserService {

	public  void  addUser(User user);
	
	public  void  updateUser(User user);
	
	public  void  deleteUser(User user);
	
	public  void  deleteById(java.io.Serializable id);
	
	public  List<User>  getAllUser ();
		
	public  List<User>  getAllUserWithPage(int pageNow,int pageSize);
	
	public  User  validLogin(String  username,String password);
}
