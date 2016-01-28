package com.zsy.frame.sample.java.control.designmode.behavioral.template.hotdrink;

/**
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-07 19:57
 */
public class Tea extends HotDrinkTemplate {
  @Override protected void addCondiments() {
    System.out.println("Adding lemon");
  }

  @Override protected void brew() {
    System.out.println("Brewing tea");
  }
}
