package com.zsy.frame.sample.java.control.designmode.creational.factory.simplefactory.tv;

public class Client
{
    public static void main(String args[])
	{
         try
         {
         	TV tv;
         	String brandName=XMLUtilTV.getBrandName();
//         	String brandName= "TCL";
//         	String brandName= "Hisense";
         	tv=TVFactory.produceTV(brandName);
         	tv.play();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
