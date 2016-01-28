package com.zsy.frame.sample.java.control.designmode.behavioral.visitor.base;

public class MySubject implements Subject {

  @Override public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  @Override public String getSubject() {
    return "love";
  }
}  