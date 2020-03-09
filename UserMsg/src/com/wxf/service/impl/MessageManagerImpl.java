package com.wxf.service.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.hql.ast.HqlASTFactory;

import sun.security.timestamp.TSRequest;
import sun.util.BuddhistCalendar;

import com.wxf.dao.MessageDao;
import com.wxf.dao.UserDao;
import com.wxf.domain.Message;
import com.wxf.domain.User;
import com.wxf.factory.BuildSessionFactory;
import com.wxf.factory.DaoFactory;
import com.wxf.service.MessageManager;

public class MessageManagerImpl  implements  MessageManager{

	private  UserDao  userDao;
	private  MessageDao messageDao;
	
	public  MessageManagerImpl() throws Exception{
		
		try {
			
			userDao =(UserDao) DaoFactory.getInstance(null).getDao("userDao");
			messageDao=(MessageDao) DaoFactory.getInstance(null).getDao("messageDao");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("在业务逻辑层，dao组件初始化异常");
		}
	}
	
	@Override
	public User ValidLogin(String username, String password) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			User user=userDao.getByName(session, username);
			if(user!=null && user.getPassword().equals(password)){
				tx.commit();
				return user;
			}
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				throw new RuntimeException("there is no user ");
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
		return null;
		
	}

	@Override
	public void registerUser(User user) {
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
			if(tx!=null){
				tx.rollback();
				throw new RuntimeException("there is error to register a user");
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
	}

	@Override
	public void pubMsg(Message msg) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			messageDao.add(session, msg);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				throw new RuntimeException("there is failto publish the message");
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
	}

	@Override
	public List<Message> showMsg(java.io.Serializable id,int pageSize,int pageNow) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Message> list=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			list=messageDao.getAllMessages(session,id, pageSize, pageNow);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				throw new RuntimeException("there is failto publish the message");
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
		return list;
	}

	@Override
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
			if(tx!=null){
				tx.rollback();
				throw new RuntimeException("there is error to update a user object");
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
	}

	@Override
	public Message getMessageById(Serializable id) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		Message msg=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			msg=messageDao.findbyId(session, id);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				throw new RuntimeException("there is failed to get a message object");
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
		return msg;
	}

	@Override
	public void updateMessage(Message message) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			messageDao.update(session, message);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				throw new RuntimeException("there is failed to update a message object");
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
	}

	@Override
	public void deleteMessage(Serializable id) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			messageDao.delete(session, id);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				throw new RuntimeException("there is failed to update a message object");
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
	}

	@Override
	public int getPageCounts(int pageSize,java.io.Serializable id) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		int pageCounts=0;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			pageCounts=messageDao.getPageCount(session, pageSize,id);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				throw new RuntimeException("there is failed to update a message object");
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
		return pageCounts;
	}

	@Override
	public int getTotalCounts(java.io.Serializable id) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		int total=0;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			total=messageDao.totalMessages(session, id);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				throw new RuntimeException("there is failed to update a message object");
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
		return total;
	}
	
}
