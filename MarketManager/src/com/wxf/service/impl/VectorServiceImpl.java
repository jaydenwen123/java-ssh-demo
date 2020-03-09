package com.wxf.service.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wxf.dao.VectorDao;
import com.wxf.domain.Vector;
import com.wxf.exception.UserException;
import com.wxf.factory.BuildSessionFactory;
import com.wxf.factory.DaoFactory;
import com.wxf.service.VectorService;

public class VectorServiceImpl implements VectorService {

	private VectorDao vectorDao;
	public  VectorServiceImpl(){
		vectorDao=(VectorDao) DaoFactory.getInstance(null).getDao("vectorDao");
	}
	
	public void addVector(Vector vector) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			vectorDao.add(session, vector);
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

	public void updateVector(Vector vector) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			vectorDao.update(session, vector);
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

	public void deleteVector(Vector vector) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			vectorDao.delete(session, vector);
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
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			vectorDao.deleteById(session, Vector.class, id);
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

	public List<Vector> getAllVector() {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Vector> list=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			list=vectorDao.findAll(session, "from Vector");
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

	public List<Vector> getAllVectorWithPage(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Vector> list=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			list=vectorDao.findAllByPage(session, "from Vector", pageNow, pageSize);
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

	

}
