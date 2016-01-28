package com.zsy.frame.sample.java.control.designmode.structural.composite.fruitdish;

import java.util.*;

/**
 * Plate  容器构件
 */
public class Plate extends MyElement {
  private ArrayList list = new ArrayList();

  public void add(MyElement element) {
    list.add(element);
  }

  public void delete(MyElement element) {
    list.remove(element);
  }

  public void eat() {
    for (Object object : list) {
      ((MyElement) object).eat();
    }
  }
}