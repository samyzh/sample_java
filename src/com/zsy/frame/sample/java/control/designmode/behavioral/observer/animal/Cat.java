package com.zsy.frame.sample.java.control.designmode.behavioral.observer.animal;

public class Cat extends MySubject {
  public void cry() {
    System.out.println("猫叫！");
    System.out.println("----------------------------");

    for (Object obs : observers) {
      ((MyObserver) obs).response();
    }
  }
}