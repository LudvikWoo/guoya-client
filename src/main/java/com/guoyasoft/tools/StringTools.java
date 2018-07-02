package com.guoyasoft.tools;

public class StringTools {
	public static boolean isNotBlank(String str){
		if(str != null){
			str=str.trim();
		}
		if(!"".equals(str.trim())&& str.trim()!=null && !"null".equalsIgnoreCase(str.trim())){
			return true;
		}else{
			return false;
		}
	}
}