package com.zsy.frame.sample.java.control.designmode.behavioral.observer.base;

public class MySubject extends AbstractSubject {

  @Override public void operation() {
    System.out.println("update self!");
    notifyObservers();
  }
}  