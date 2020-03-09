package com.wxf.factory;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.wxf.dao.BaseDao;


public class DaoFactory {
	
	private Map<String, BaseDao> daoMap=new HashMap<String, BaseDao>();
	private static DaoFactory df;
	
	private DaoFactory(String realpath) throws Exception{
		Document document=new SAXReader().read(new File(realpath+"\\daoContext.xml"));
		Element root=document.getRootElement();
		List list=root.elements();
		for(Iterator iterator=list.iterator();iterator.hasNext();){
			Element element=(Element) iterator.next();
			String id=element.attributeValue("id");
			String impl=element.attributeValue("class");
			Class implClass=Class.forName(impl);
			BaseDao dao=(BaseDao) implClass.newInstance();
			daoMap.put(id, dao);
		}
	}
	
	public static DaoFactory  getInstance(String realpath){
		if(df==null){
			try {
				df=new DaoFactory(realpath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return df;
	}
	
	public BaseDao getDao(String id){
		return daoMap.get(id);
	}

}
