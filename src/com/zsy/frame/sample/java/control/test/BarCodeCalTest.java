package com.zsy.frame.sample.java.control.test;

import java.util.ArrayList;

public class BarCodeCalTest {

	public static void main(String[] args) {
//		System.out.println(barcode20Check("2395 4270016 80000001"));
//		2395427001680000001
//		23954270016800000014
		String stemp = barcodeCheckByType("2395427001680000001",BarCodeType.TYPE_20);
		System.out.println(stemp);
	}

	/**
	 * 1234 --12342
	 * s1=1+3=4
	 * s2=2+4=6
	 * s2=4*3=12
	 * s3=18
	 * s4=18%10=8
	 * s5=10-8=2
	 * s=2%10=8
	 * @param barcode
	 * @return
	 */
	  public static String barcodeCheckByType(String barCode,BarCodeType barCodeType ) {
		    int evenNumberSum = 0;//s1
		    int oddNumberSum = 0;//s2
		    int s3=0;
		    ArrayList<Integer> tempNum = new ArrayList<>();

		    String numberStr[] = barCode.replace(" ", "").split("");

		    for (int i = 0; i < numberStr.length; i++) {
		      tempNum.add(Integer.parseInt(numberStr[i].trim()));
		    }

		    for (int i = 0; i < tempNum.size(); i++) {
		      if (i % 2 != 0) {// 偶数(应从0开始)
		        evenNumberSum = evenNumberSum + tempNum.get(i);
		      } else {
		        oddNumberSum = oddNumberSum + tempNum.get(i);
		      }
		    }
		    switch (barCodeType){
		      case TYPE_20:
		        oddNumberSum = oddNumberSum * 3;
		        s3= oddNumberSum + evenNumberSum;
		        break;
		      case TYPE_22:
		        break;
		      default:
		        break;
		    }
		    int s4 = s3 % 10;
		    int x = (10 - s4) % 10;
		    return barCode + x;
		  }
	  

	  /**
	   * 目前有两种类型
	   */
	  public enum BarCodeType {
	    TYPE_20, TYPE_22
	  }
}
