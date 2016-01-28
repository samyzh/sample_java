package com.zsy.frame.sample.java.control.designmode.creational.factory.sender.base;
/**
 * @description：
 * 左边EIT造型负责《创建》右边EIT造型的对象（Object）
 * 就称左边EIT造型为：Factory(工厂)EIT;
 * 就称右边EIT造型为：Product(产品)EIT;
 * 
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。首先看下关系图：
 * @author samy
 * @date 2015-3-17 下午11:13:19
 */
public class FactoryTest {  
  
    public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produce("sms");  
        sender.Send();  
    }  
}  