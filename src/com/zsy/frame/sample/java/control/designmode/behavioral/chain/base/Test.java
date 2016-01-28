package com.zsy.frame.sample.java.control.designmode.behavioral.chain.base;

public class Test {

  public static void main(String[] args) {
    MyHandler h1 = new MyHandler("h1");
    MyHandler h2 = new MyHandler("h2");
    MyHandler h3 = new MyHandler("h3");

    //创建职责链
    h1.setHandler(h2);
    h2.setHandler(h3);

    h1.operator();
  }
}  