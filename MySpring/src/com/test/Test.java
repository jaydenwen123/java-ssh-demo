package com.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ByteService;
import com.service.UserService;
import com.util.ApplicationContextUtil;

public class Test {

	public static void main(String[] args) {
		
		
		/*UserService  user=new UserService();
		user.sayhello();
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService) ac.getBean("userService");
		userService.sayhello();*/
		/*ByteService byteService=(ByteService) ac.getBean("byteService");
		byteService.sayByte();	*/
		((UserService)ApplicationContextUtil.getApplicationContext()
				.getBean("userService")).sayhello();
	}
	
	
}
