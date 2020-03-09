package com.wxf.dao;

import java.util.List;

import org.apache.bsf.util.event.adapters.java_awt_event_ActionAdapter;
import org.hibernate.Session;
import org.hibernate.sql.Delete;

import com.sun.xml.internal.messaging.saaj.soap.MessageImpl;
import com.wxf.domain.Message;

public interface MessageDao extends BaseDao{
	
	public void delete(Session session ,java.io.Serializable id);
	
	public List<Message> getAllMessages(Session session,java.io.Serializable id,int pageSize, int PageNow);
	
	public int getPageCount(Session session,int pageSize,java.io.Serializable id);
	
	public Message findbyId(Session session,java.io.Serializable id);
	
	public int totalMessages(Session session,java.io.Serializable id);
	
}
