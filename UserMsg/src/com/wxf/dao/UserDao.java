package com.wxf.dao;

import org.hibernate.Session;

import com.wxf.domain.User;

public interface UserDao extends BaseDao {

	public User getByName(Session session,String username);
}
