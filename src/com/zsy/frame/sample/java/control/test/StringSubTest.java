package com.zsy.frame.sample.java.control.test;

public class StringSubTest {

	public static void main(String[] args) {
		String temp = "防止空格换行css无法控制撑大页面，用正则表达式替换掉空格，所以截取前面100个字符,页面显示的内容多少用css控制";
		System.out.println(temp.substring(0,10));
		System.out.println(temp.substring(10,temp.length()));
	}

}
