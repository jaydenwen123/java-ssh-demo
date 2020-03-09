package com.wxf.service.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wxf.dao.DeptDao;
import com.wxf.domain.Dept;
import com.wxf.exception.DeptException;
import com.wxf.exception.UserException;
import com.wxf.factory.BuildSessionFactory;
import com.wxf.factory.DaoFactory;
import com.wxf.service.DeptService;

public class DeptServiceImpl implements DeptService{

	private DeptDao deptDao;
	
	public DeptServiceImpl(){
		deptDao=(DeptDao) DaoFactory.getInstance(null).getDao("deptDao");
	}
	public void addDept(Dept dept) {
		// TODO Auto-generated method stub
		
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			deptDao.add(session, dept);
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

	public void updateDept(Dept dept) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			deptDao.update(session, dept);
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

	public void deleteDept(Dept dept) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			deptDao.delete(session, dept);
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
			deptDao.deleteById(session, Dept.class, id);
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

	public List<Dept> getAllDept() {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Dept> list=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			list=deptDao.getAllDept(session);
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

	public List<Dept> getAllDeptWithPage(int pageNow, int pageSize) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		List<Dept> list=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			list=deptDao.getAllDeptWithPage(session, pageNow, pageSize);
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
	public Dept getById(Serializable id) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		Dept dept=null;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			dept=(Dept) deptDao.findById(session, Dept.class, id);
			tx.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				throw new  DeptException("通过id获取dept异常");
			}
		}finally{
			if(session!=null && session.isOpen()){
				session.close();
			}
		}
		return dept;
	}
	public Integer getPageCounts(int pageSize) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction tx=null;
		Integer counts=0;
		try {
			session=BuildSessionFactory.openSession();
			tx=session.beginTransaction();
			counts=deptDao.getPageCounts(session, pageSize);
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if(tx!=null){
				tx.rollback();
				throw new DeptException("获取dept行数出现异常");
			}
		}finally{
			if(session!=null&& session.isOpen()){
				session.close();
			}
		}
		return counts;
	}

	

}
