package com.test;

import org.springframework.context.ApplicationContext;

import com.service.ChangeLetter;
import com.service.LowerLetter;
import com.util.ApplicationContextUtil;

public class TestLetter {

	
	public static void main(String[] args) {
		
		ApplicationContext  ac=ApplicationContextUtil.getApplicationContext();
		/*LowerLetter lowerLetter=(LowerLetter) ac.getBean("lowerLetter");
		System.out.println(lowerLetter.change());*/
		ChangeLetter lowerLetter=(ChangeLetter) ac.getBean("lowerLetter");
		System.out.println(lowerLetter.change());
		ChangeLetter upperLetter=(ChangeLetter) ac.getBean("upperLetter");
		System.out.println(upperLetter.change());
	}
}
