package com.zsy.frame.sample.java.control.designmode.creational.factory.simplefactory.usrmanager;

public abstract class User
{
    public void sameOperation()
	{
        System.out.println("修改个人资料！");
	}
	
	public abstract void diffOperation();
}