package com.zsy.frame.sample.java.control.designmode.structural.bridge.pen;

public class Black implements Color
{
    public void bepaint(String penType,String name)
	{
		System.out.println(penType + "黑色的"+ name + ".");
	}
}