package com.wxf.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.bsf.util.event.adapters.java_awt_event_ActionAdapter;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.hql.ast.HqlASTFactory;

import com.wxf.dao.MessageDao;
import com.wxf.domain.Message;
import com.wxf.factory.BuildSessionFactory;

public class MessageDaoImpl extends  BaseDaoImpl implements  MessageDao{

	@Override
	public void delete(Session session,java.io.Serializable id) {
		// TODO Auto-generated method stub
		this.delete(session, Message.class, id);
	}

	@Override
	public List<Message> getAllMessages(Session session,java.io.Serializable id,int pageSize, int PageNow) {
		// TODO Auto-generated method stub
		String hql="from Message where user.id="+id+"order by pubDate";
		return this.findByPage(session, hql, pageSize, PageNow);
	}

	@Override
	public int getPageCount(Session session,int pageSize ,java.io.Serializable id) {
		// TODO Auto-generated method stub
		String hql="select count(*) from Message where user.id="+id;
		return this.pageCount(session, hql, pageSize);
	}
	

	@Override
	public Message findbyId(Session session,java.io.Serializable id) {
		// TODO Auto-generated method stub
		return (Message) this.findById(session, Message.class, id);
	}

	@Override
	public int totalMessages(Session session, java.io.Serializable id) {
		// TODO Auto-generated method stub
		String hql="select count(*) from Message where user.id="+id;
		return this.totalCount(session, hql);
	}
}
