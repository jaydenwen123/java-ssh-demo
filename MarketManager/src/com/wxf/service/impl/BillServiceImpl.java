package com.wxf.service.impl;

import java.io.Serializable;
import java.util.BitSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wxf.dao.BillDao;
import com.wxf.domain.Bill;
import com.wxf.domain.BillItem;
import com.wxf.exception.UserException;
import com.wxf.factory.BuildSessionFactory;
import com.wxf.factory.DaoFactory;
import com.wxf.service.BillItemService;
import com.wxf.service.BillService;

public class BillServiceImpl implements BillService{

	private BillDao billDao;
	public BillServiceImpl(){
		billDao=(BillDao) DaoFactory.getInstance(null).getDao("billDao");
	}
	public void addBill(Bill bill) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			billDao.add(session, bill);
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

	public void updateBill(Bill bill) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			billDao.update(session, bill);
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

	public void deleteBill(Bill bill) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			billDao.delete(session, bill);
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
			billDao.deleteById(session, Bill.class, id);
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

	public List<Bill> getAllBill() {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Bill> list=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			list=billDao.getAllBill(session);
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
	

	public List<Bill> getAllBillWithPage(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Bill> list=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			list=billDao.getAllBillByPage(session, pageNow, pageSize);
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
