package com.wxf.dao.impl;

import org.hibernate.Session;

import com.wxf.dao.UserDao;
import com.wxf.domain.User;

public class UserDaoImpl extends BaseDaoImpl implements UserDao {

	@Override
	public User getByName(Session session, String username) {
		// TODO Auto-generated method stub
		return (User) session.createQuery("from User where username=?").
				setParameter(0, username).uniqueResult();
	}

}
