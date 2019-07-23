package com.mego.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static String nowToYYMMddHHmmss() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyMMddHHmmss");  
		return formatter.format(new Date());
	}
	
	public static Date now() {
		return new Date();
	}
	
}
