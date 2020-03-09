package com.wxf.service.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wxf.dao.IncomeDao;
import com.wxf.domain.Income;
import com.wxf.exception.UserException;
import com.wxf.factory.BuildSessionFactory;
import com.wxf.factory.DaoFactory;
import com.wxf.service.IncomeService;

public class IncomeServiceImpl implements IncomeService{

	private IncomeDao incomeDao;
	public  IncomeServiceImpl(){
		incomeDao=(IncomeDao) DaoFactory.getInstance(null).getDao("incomeDao");
	}
	
	public void addIncome(Income income) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			incomeDao.add(session, income);
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

	public void updateIncome(Income income) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			incomeDao.update(session, income);
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

	public void deleteIncome(Income income) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			incomeDao.deleteById(session, Income.class, id);
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

	public List<Income> getAllIncome() {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Income> list=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			list=incomeDao.findAll(session, "from Income");
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

	public List<Income> getAllIncomeWithPage(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Income> list=null;
		try {
			session=BuildSessionFactory.getCurrentSession();
			tx=session.beginTransaction();
			list=incomeDao.findAllByPage(session, "from Income", pageNow, pageSize);
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
