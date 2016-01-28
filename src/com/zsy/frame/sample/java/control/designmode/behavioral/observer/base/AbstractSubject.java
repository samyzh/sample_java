package com.zsy.frame.sample.java.control.designmode.behavioral.observer.base;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

  /**
   * 类 速度 多线程安全性 适用方面
   * Vector 慢 安全 提供了线程序同 步,在多线程是安全的.
   * ArrayList 快 不安全 多线程不安全
   * Hashtable和HashMap的区别是同样的道理。
   */
  private Vector<Observer> vector = new Vector<Observer>();

  @Override public void add(Observer observer) {
    vector.add(observer);
  }

  @Override public void del(Observer observer) {
    vector.remove(observer);
  }

  @Override public void notifyObservers() {
    Enumeration<Observer> enumo = vector.elements();
    while (enumo.hasMoreElements()) {
      enumo.nextElement().update();
    }
  }
}  