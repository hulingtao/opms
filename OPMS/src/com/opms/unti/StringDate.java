package com.opms.unti;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class StringDate {
	public String getTimeStampStringDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		String format = dateFormat.format(new Date());
		format = format + new Random().nextInt(1000);
		return format;
	}
	
	public String getNowStringDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		String format = dateFormat.format(new Date());
		return format;
	}
	
	public String getStringdate(Date date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		return dateFormat.format(date);
	}
}
