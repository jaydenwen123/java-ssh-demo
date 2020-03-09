package com.wxf.factory;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class DaoFactory {

	private Map<String, Object> daoMap=new HashMap<String, Object>();
	private static DaoFactory df;
	private DaoFactory(String path) throws Exception{
		Document document=new SAXReader().read(new File(path+"\\DaoContext.xml"));
		Element root=document.getRootElement();
		List e1=root.elements();
		Iterator iter=e1.iterator();
		while (iter.hasNext()) {
			Element element=(Element) iter.next();
			String id=element.attributeValue("id");
			String impl=element.attributeValue("class");
			Class impleClass=Class.forName(impl);
			Object object=impleClass.newInstance();
			daoMap.put(id, object);
		}
	}
	
	public  static  DaoFactory getInstance(String path) throws Exception{
		if(df==null){
			df=new DaoFactory(path);
		}
		return df;
	}
	
	public Object getDao(String id){
		return daoMap.get(id);
	}
}
