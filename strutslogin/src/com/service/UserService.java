package com.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sun.print.resources.serviceui;

import com.dao.JdbcUtil;
import com.domain.Users;
import com.forms.UserForm;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
public class UserService {

	public Users  check( Users user) throws SQLException{
		String  sql="select * from t_users where name=? and password=?";
		String []parameters={user.getUsername(),user.getPassword()};
		List list=JdbcUtil.executeQuery1(sql, parameters);
		if(list.size()==1){
			Object[] obj=(Object[]) list.get(0);
			user.setId(Integer.parseInt(obj[0]+""));
			return user;
		}else {
			return null;
		}
		
	}
}
