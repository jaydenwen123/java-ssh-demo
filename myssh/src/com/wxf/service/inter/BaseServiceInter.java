package com.wxf.service.inter;

import java.util.List;

public interface BaseServiceInter {

	//1.ͳһ���һ������
	public void add(Object obj);
	//2.ͳһ�޸ģ�ɾ������
	public void execute(String hql,Object[] parameters);
	//3.��ȡȫ������
	public  List ExecuteQuery(String hql,Object [] parameters);
	//4.ͨ��id����ȡ����
	public  Object  FindById(Class clazz,java.io.Serializable id);
	//5.��ҳ��ѯ����
	public List ExecuteQuery(String hql,Object[] parameters,int pageSize,int pageNow);
	//6.��ȡ�ܵ�ҳ��
	public int  getPageCount(String hql,Object[] parameters ,int pageSize);
	//7.����һ������
	public void update(Object object);
	//8.����idɾ��һ������
	public void delete(Class clazz,java.io.Serializable id);
}
