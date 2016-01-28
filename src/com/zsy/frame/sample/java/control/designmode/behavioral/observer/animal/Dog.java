package com.zsy.frame.sample.java.control.designmode.behavioral.observer.animal;

public class Dog implements MyObserver {
  public void response() {
    System.out.println("狗跟着叫！");
  }
}