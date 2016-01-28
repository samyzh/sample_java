package com.zsy.frame.sample.java.control.designmode.structural.bridge.pen;

public class Green implements Color
{
    public void bepaint(String penType,String name)
	{
		System.out.println(penType + "绿色的"+ name + ".");
	}
}