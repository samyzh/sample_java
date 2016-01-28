package com.zsy.frame.sample.java.control.designmode.behavioral.visitor.shopping;

//ConcreteVisitor: 具体访问者
public class Customer extends Visitor {
  public void visit(Apple apple) {
    System.out.println("顾客" + name + "选苹果。");
  }

  public void visit(Book book) {
    System.out.println("顾客" + name + "买书。");
  }
}