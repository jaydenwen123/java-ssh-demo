package com.wxf.service.impl;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wxf.dao.UserDao;
import com.wxf.domain.User;
import com.wxf.exception.UserException;
import com.wxf.factory.BuildSessionFactory;
import com.wxf.factory.DaoFactory;
import com.wxf.service.UserService;

public class UserServiceImpl implements UserService{
	
	private UserDao userDao=null;
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
		userDao=(UserDao) DaoFactory.getInstance(null).getDao("userDao");
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			userDao.add(session, user);
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
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			userDao.update(session, user);
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
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			userDao.delete(session, user);
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
	}

	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			userDao.deleteById(session, User.class, id);
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
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<User> list=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			list=userDao.findAll(session, "from User");
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
		return list;
	}

	public List<User> getAllUserWithPage(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<User> list=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			list=userDao.findAllByPage(session, "from User", pageNow, pageSize);
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
		return list;
	}

	public User validLogin(String username, String password) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		User user=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			user=userDao.validLogin(session, username, password);
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
		return user;
	}
	
	/*public static void main(String[] args) {
		
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		User user=userServiceImpl.validLogin("wen", "123");
		System.out.println(user.getId());
		
	}*/
	
}
