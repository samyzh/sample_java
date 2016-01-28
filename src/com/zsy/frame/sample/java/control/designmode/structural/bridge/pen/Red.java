package com.zsy.frame.sample.java.control.designmode.structural.bridge.pen;

public class Red implements Color
{
    public void bepaint(String penType,String name)
	{
		System.out.println(penType + "红色的"+ name + ".");
	}
}