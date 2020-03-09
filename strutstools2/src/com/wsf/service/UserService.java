package com.wsf.service;

import java.util.ArrayList;
import java.util.List;

import com.wsf.dao.JdbcUtil;
import com.wsf.domain.Users;

public class UserService {

	public boolean AddUser(Users user){
		String sql="insert into users (username,password," +
				"oldfilename,newfilename) values(?,?,?,?)";
		String []parameters={user.getUsername(),user.getPassword(),
				user.getOldfilename(),user.getNewfilename()
				};
		return JdbcUtil.executeUpdate(sql, parameters);
	}
	
	public List<Users> getAllUsers(){
		String sql="select * from users";
		List list=JdbcUtil.executeQuery1(sql, null);
		List<Users> list2=new ArrayList<Users>();
		
		for (int i = 0; i < list.size(); i++) {
			Object[] objs=(Object[]) list.get(i);
			Users user=new Users();
			user.setUsername(objs[0].toString());
			user.setPassword(objs[1].toString());
			user.setOldfilename(objs[2].toString());
			user.setNewfilename(objs[3].toString());
			list2.add(user);
//			user.toString();
		}
		return list2;
	}
	public  Users getUsersByName(String username){
		String sql="select * from users where username=?";
		String []parameters={username};
		List list=JdbcUtil.executeQuery1(sql, parameters);
		System.out.println(list.size());
		Users user=new Users();
		Object[] objs=(Object[]) list.get(0);
		user.setUsername(objs[0].toString());
		user.setPassword(objs[1].toString());
		user.setOldfilename(objs[2].toString());
		user.setNewfilename(objs[3].toString());
		return user;
				
	}
}
