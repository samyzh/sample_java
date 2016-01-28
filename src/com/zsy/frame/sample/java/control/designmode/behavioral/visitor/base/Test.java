package com.zsy.frame.sample.java.control.designmode.behavioral.visitor.base;

public class Test {

  public static void main(String[] args) {
    Visitor visitor = new MyVisitor();
    Subject sub = new MySubject();
    sub.accept(visitor);
  }
}  