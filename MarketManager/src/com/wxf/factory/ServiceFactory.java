package com.wxf.factory;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
public class ServiceFactory {
	private Map<String, Object> serviceMap=new HashMap<String, Object>();
	private static ServiceFactory sf;
	
	private ServiceFactory(String realpath) throws Exception{
		Document document=new SAXReader().read(new File(realpath+"\\serviceContext.xml"));
		Element root=document.getRootElement();
		List list=root.elements();
		for(Iterator iterator=list.iterator();iterator.hasNext();){
			Element element=(Element) iterator.next();
			String id=element.attributeValue("id");
			String impl=element.attributeValue("class");
			Class implClass=Class.forName(impl);
			Object service=implClass.newInstance();
			serviceMap.put(id, service);
		}
	}
	
	public static ServiceFactory  getInstance(String realpath){
		if(sf==null){
			try {
				sf=new ServiceFactory(realpath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sf;
	}
	
	public Object getService(String id){
		return serviceMap.get(id);
	}
}
