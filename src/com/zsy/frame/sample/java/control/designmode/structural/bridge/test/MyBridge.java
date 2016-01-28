package com.zsy.frame.sample.java.control.designmode.structural.bridge.test;

public class MyBridge extends Bridge {
  public void method() {
    getSource().method();
  }
}  