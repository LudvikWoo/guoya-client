package com.guoyasoft.tools;

public class StringTools {
	public static boolean isNotBlank(String str){
		if(str != null && !"".equals(str.trim()) && !"null".equalsIgnoreCase(str.trim())){
			return true;
		}else{
			return false;
		}
	}
} 