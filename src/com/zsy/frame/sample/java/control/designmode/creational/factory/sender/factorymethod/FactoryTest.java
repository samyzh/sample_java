package com.zsy.frame.sample.java.control.designmode.creational.factory.sender.factorymethod;

import com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base.Sender;

/**
 * @description：
 * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。关系图：
 * @author samy
 * @date 2015-3-17 下午11:19:44
 */
public class FactoryTest {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.Send();
	}
}