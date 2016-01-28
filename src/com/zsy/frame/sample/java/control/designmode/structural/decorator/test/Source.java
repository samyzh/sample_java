package com.zsy.frame.sample.java.control.designmode.structural.decorator.test;

//Source类是被装饰类
public class Source implements Sourceable {
  @Override public void method() {
    System.out.println("the original method!");
  }
} 