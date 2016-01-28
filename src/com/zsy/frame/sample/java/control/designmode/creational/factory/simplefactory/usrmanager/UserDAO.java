package com.zsy.frame.sample.java.control.designmode.creational.factory.simplefactory.usrmanager;

public class UserDAO
{
    public int findPermission(String userName,String userPassword)
    {
        if("zhangsan"==userName&&"123456"==userPassword)
    	{
    		return 2;
    	}
    	else
    	{
    		return -1;
    	}
    }
}
