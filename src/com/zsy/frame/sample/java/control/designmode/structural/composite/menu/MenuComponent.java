package com.zsy.frame.sample.java.control.designmode.structural.composite.menu;

import java.util.Iterator;

/**
 * 抽象构件
 */
public abstract class MenuComponent {

  public String getName() {
    return "";
  }

  public String getDescription() {
    return "";
  }

  public float getPrice() {
    return 0;
  }

  public boolean isVegetable() {
    return false;
  }

  public abstract void print();

  /**
   * 注意这里的空应用的用法,为了有统一的父类，操作获取迭代器
   */
  public Iterator getIterator() {
    return new NullIterator();
  }
}
