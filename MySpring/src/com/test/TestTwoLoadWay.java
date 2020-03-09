package com.test;

import java.security.AccessControlContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.service.UpperLetter;
import com.util.ApplicationContextUtil;

public class TestTwoLoadWay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*ApplicationContext  ac=ApplicationContextUtil.getApplicationContext();
		UpperLetter upperLetter=(UpperLetter) ac.getBean("upperLetter");
		System.out.println(upperLetter.change());*/
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		UpperLetter upperLetter=(UpperLetter) factory.getBean("upperLetter");
		System.out.println(upperLetter.change());
	}

}
