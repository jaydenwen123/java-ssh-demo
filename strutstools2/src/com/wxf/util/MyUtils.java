package com.wxf.util;

import java.util.UUID;

public class MyUtils {

	public static String GetNewFileName(String oldFileName){
		String newFileName=UUID.randomUUID()+
				oldFileName.substring(oldFileName.lastIndexOf("."));
		return newFileName;
	}
}
