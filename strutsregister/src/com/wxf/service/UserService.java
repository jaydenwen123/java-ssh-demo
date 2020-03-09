package com.wxf.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.wxf.dao.JdbcUtil;
import com.wxf.dao.SqlHelper;
import com.wxf.domain.User;

public class UserService {

	public static boolean  checkUser(User user){
		String sql="select * from t_users where id=? and name=?";
		String [] parameters={user.getUserid(),user.getUsername()};
		List list=JdbcUtil.executeQuery1(sql, parameters);
		if(list.size()==1){
			return true;
		}else {
			return false;
		}
	}
	public static boolean  register(User user){
		String sql="insert into t_users (id,name,email) values (?,?,?)";
		String []parameters={user.getUserid(),user.getUsername(),user.getPassword()};
		return JdbcUtil.executeUpdate(sql, parameters);
	}
	
}
