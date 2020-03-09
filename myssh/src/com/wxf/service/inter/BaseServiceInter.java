package com.wxf.service.inter;

import java.util.List;

public interface BaseServiceInter {

	//1.统一添加一个对象
	public void add(Object obj);
	//2.统一修改，删除对象
	public void execute(String hql,Object[] parameters);
	//3.获取全部对象
	public  List ExecuteQuery(String hql,Object [] parameters);
	//4.通过id来获取对象
	public  Object  FindById(Class clazz,java.io.Serializable id);
	//5.分页查询对象
	public List ExecuteQuery(String hql,Object[] parameters,int pageSize,int pageNow);
	//6.获取总的页数
	public int  getPageCount(String hql,Object[] parameters ,int pageSize);
	//7.更新一个对象
	public void update(Object object);
	//8.根据id删除一个对象
	public void delete(Class clazz,java.io.Serializable id);
}
