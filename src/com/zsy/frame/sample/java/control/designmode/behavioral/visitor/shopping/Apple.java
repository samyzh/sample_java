package com.zsy.frame.sample.java.control.designmode.behavioral.visitor.shopping;

//ConcreteElement: 具体元素
public class Apple implements Product {
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}