package com.wxf.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.hql.ast.HqlASTFactory;

import com.sun.net.ssl.SSLContext;
import com.wxf.dao.BaseDao;
import com.wxf.factory.BuildSessionFactory;

public abstract  class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Session s, Object object) {
		// TODO Auto-generated method stub
		s.save(object);
	}

	@Override
	public void update(Session s, Object object) {
		// TODO Auto-generated method stub
		s.update(object);
	}

	@Override
	public Object findById(Session s, Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return s.get(clazz, id);
	}

	@Override
	public List getAll(Session s,String hql) {
		// TODO Auto-generated method stub
		return s.createQuery(hql).list();
	}

	@Override
	public void delete(Session s, Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		s.delete(s.get(clazz, id));
	}

	@Override
	public void delete(Session s, Object object) {
		// TODO Auto-generated method stub
		s.delete(object);
	}
	
	public List  findByPage (Session s, String hql,int pageSize, int pageNow){
		
		return  s.createQuery(hql).setFirstResult((pageNow-1)*pageSize)
					.setMaxResults(pageSize).list();
		
	}
		

		public    int   pageCount(Session s,String hql,int pageSize){
			
			Object obj=s.createQuery(hql).uniqueResult();
			Integer p=Integer.parseInt(obj.toString());
			int count =(p-1)/pageSize+1;
			System.out.println(count);
			return count;
		}
		
		public static void main(String[] args) {
			Session session=null;
			Transaction tx=null;
			int pageCounts=0;
			String hql="select count(*) from Message where user.id="+2;
			try {
				session=BuildSessionFactory.openSession();
				tx=session.beginTransaction();
//				pageCounts=new BaseDaoImpl(). pageCount( session, hql,3);
				/*Object obj=session.createQuery(hql).uniqueResult();
				pageCounts=Integer.parseInt(obj.toString());*/
				System.out.println(pageCounts);
				/*int count =(pageCounts-1)/3+1;
				System.out.println(count);*/
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
		
		public int  totalCount(Session s,String hql){
			Object object= s.createQuery(hql).uniqueResult();
			int  total=Integer.parseInt(object.toString());
			return total;
					
		}
	}
	
