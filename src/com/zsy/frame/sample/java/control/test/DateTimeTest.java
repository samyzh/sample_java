package com.zsy.frame.sample.java.control.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {

	public static void main(String[] args) {
//		Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
//		int year = c.get(Calendar.YEAR);
//		int month = c.get(Calendar.MONTH);
//		int date = c.get(Calendar.DATE);
//		int hour = c.get(Calendar.HOUR_OF_DAY);
//		int minute = c.get(Calendar.MINUTE);
//		int second = c.get(Calendar.SECOND);
//		System.out.println(year + "/" + String.format("%02d",month) + "/" + date + " " +hour + ":" +minute + ":" + second);

		
		Calendar calendar = Calendar.getInstance();
//		int yearTemp  = calendar.get(Calendar.YEAR);
//		int monthTemp  = calendar.get(Calendar.MONTH);
		int yearTemp  = 2015;
		int monthTemp  = 0;
		if (monthTemp==0){ //一月份情况
			yearTemp = yearTemp-1;
			monthTemp =12;
		}
		System.out.println(yearTemp+String.format("%02d",monthTemp));
		
//		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMM");
//		System.out.println(Integer.parseInt(sdf.format(new Date()))-1+"");
//		System.out.println(Float.parseFloat(sdf.format(new Date()))-1+"");
	}
}
