package com.zsy.frame.sample.java.control.designmode.structural.bridge.pen;

public class Blue implements Color
{
    public void bepaint(String penType,String name)
	{
		System.out.println(penType + "蓝色的"+ name + ".");
	}
}