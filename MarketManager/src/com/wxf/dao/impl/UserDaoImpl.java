package com.wxf.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wxf.dao.UserDao;
import com.wxf.domain.User;
import com.wxf.exception.UserException;

public class UserDaoImpl extends BaseDaoImpl implements UserDao{

	public User validLogin( Session session,String username, String password) {
		// TODO Auto-generated method stub
		String hql="from User where username=?";
		User user=(User) this.findByName(session, hql, username);
		if(user!=null && user.getPassword().equals(password)){
			return user;
		}
		else {
			return null;
		}
	}
	/*public static void main(String[] args) {
		
		UserDaoImpl userDaoImpl=new UserDaoImpl();
	
		Session session=null;
		Transaction tx=null;
		User user=null;
		try {
			session=HibernateSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			user=userDaoImpl.validLogin(session, "wen", "123");
			System.out.println(user.getId()+","+user.getUsername());
			
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(tx!=null){
				tx.rollback();
				throw new UserException(e.getMessage());
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
	}*/
		
}
