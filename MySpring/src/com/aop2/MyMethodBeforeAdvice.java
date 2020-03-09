package com.aop2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.springframework.aop.MethodBeforeAdvice;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str="打印日志。。。。。。时间为:"+simpleDateFormat.format(date);
		System.out.println(str);
		byte[] data=str.getBytes();
		OutputStream  out=new BufferedOutputStream(new FileOutputStream(new File("E:/picture/aop.txt")));
		out.write(data);
		out.flush();
		out.close();
		System.out.println("写出日志成功");
		
	}

}
