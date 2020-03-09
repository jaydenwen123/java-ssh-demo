package com.wxf.service.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wxf.dao.BillItemDao;
import com.wxf.domain.BillItem;
import com.wxf.exception.UserException;
import com.wxf.factory.BuildSessionFactory;
import com.wxf.factory.DaoFactory;
import com.wxf.service.BillItemService;

public class BillItemServiceImpl implements BillItemService{

	private BillItemDao billItemDao;

	public BillItemServiceImpl(){
		
		billItemDao=(BillItemDao) DaoFactory.getInstance(null).getDao("billItemDao");
	}
	
	public void addBillItem(BillItem billItem) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			billItemDao.add(session, billItem);
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

	public void updateBillItem(BillItem billItem) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			billItemDao.update(session, billItem);
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

	public void deleteBillItem(BillItem billItem) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			billItemDao.delete(session, billItem);
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
			billItemDao.deleteById(session, BillItem.class, id);
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

	public List<BillItem> getAllBillItem() {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<BillItem> list=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			list=billItemDao.getAllBillItem(session);
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

	public List<BillItem> getAllBillItemWithPage(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<BillItem> list=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			list=billItemDao.getAllBillItemWithPage(session, pageNow, pageSize);
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
