package com.zsy.frame.sample.java.control.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringSplitTest {

	public static void main(String[] args) {
		String temp = "20160615&6";
		String tempArray[] = temp.split("\\&");
		String tempBuyday = tempArray[0];
		String tempCount = tempArray[1];
		System.out.println("tempBuyday="+tempBuyday);
		System.out.println("tempCount="+tempCount);
		 String tempTodayDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		 System.out.println("tempTodayDate="+tempTodayDate);
		 if(tempBuyday.equals(tempTodayDate)&&Integer.parseInt(tempCount)>0){
			System.out.println("你今天已经买了"+tempCount);
		}
		 
//		for (String string : tempArray) {
//		for (int i = 0; i < tempArray.length; i++) {
//			System.out.println(tempArray[i]);	
//		}
	}
}

