package com.aop1;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowsAdvice implements ThrowsAdvice {

	public void afterThrowing(Method m,Object[] os,Object
			target,Exception e){
		System.out.println("��������"+e.getMessage());
	}

}
