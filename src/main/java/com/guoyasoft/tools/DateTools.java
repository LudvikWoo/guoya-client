package com.guoyasoft.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTools {
	public static String format(Date date,String format){
		SimpleDateFormat sf=new SimpleDateFormat(format);
		return sf.format(date);
	}

	public static Date parse(String str,String format){
		SimpleDateFormat sf=new SimpleDateFormat(format);
		try {
			return sf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
