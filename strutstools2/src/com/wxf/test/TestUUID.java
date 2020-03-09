package com.wxf.test;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;
import com.wsf.dao.JdbcUtil;
import com.wsf.domain.Users;

public class TestUUID {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ToTestUUIS();
//		ToTestJdbc();
		String sql="select * from users where username=?";
		String  []parameters={"ÎÄÐ¡·É"};
		List list=JdbcUtil.executeQuery1(sql, parameters);
		System.out.println(list.size());
	}

	private static void ToTestJdbc() {
		String sql="select * from users";
		List list=JdbcUtil.executeQuery1(sql, null);
		Users users=new Users();
		for (int j = 0; j < list.size(); j++) {
			Object []obj=(Object[]) list.get(j);
			users.setUsername(obj[0].toString());
			users.setPassword(obj[1].toString());
			users.setOldfilename(obj[2].toString());
			users.setNewfilename(obj[3].toString());
			users.toString();
		}
	}

	private static void ToTestUUIS() {
		String str=UUID.randomUUID().toString();
		System.out.println(str);
		String filename="123321.jsp";
		int beginIndex=filename.lastIndexOf(".");
		String suffix=filename.substring(beginIndex);
		System.out.println(suffix);
	}

}
