package com.guoyasoft.tools;

public class StringTools {
	public static boolean isNotBlank(String str){
		if(!"".equals(str)&& str!=null && !"null".equals(str) && !"NULL".equals(str)){
			return true;
		}else{
			return false;
		}
	}
}
