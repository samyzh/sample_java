package com.zsy.frame.sample.java.control.test;

import java.text.DecimalFormat;

public class DoubleFormatTest {
//	static DecimalFormat twolastDF = new DecimalFormat("#0.00");
//	static DecimalFormat twolastDF = new DecimalFormat("#0.000");
	static DecimalFormat twolastDF = new DecimalFormat("00.000");
//	static	DecimalFormat twolastDF = new DecimalFormat("0.###");
	

	public static void main(String[] args) {
//		String tempStr = twolastDF.format(2.1566675);
//		String tempStr = "2.1566675";
//		double tempStr = 2.1566675;
		double tempStr = 9.12345;
		
//		double temp = Float.parseFloat(tempStr);
//		double temp = Float.valueOf(tempStr);
		
//		System.out.println(temp);
//		System.out.println(tempStr);
		
//		System.out.println(String.format("%05d",Integer.valueOf(tempStr))+"");
//		System.out.println(String.format("%05d",(int)tempStr)+"");
		System.out.println(String.format("%s",twolastDF.format(tempStr)));
		System.out.println(String.format("%s",twolastDF.format(tempStr).replace(".", "")));
//		System.out.println(tempStr);
	}

}
