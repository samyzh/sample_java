package com.zsy.frame.sample.java.control.designmode.behavioral.visitor.base;

public class MyVisitor implements Visitor {

  @Override public void visit(Subject sub) {
    System.out.println("visit the subject：" + sub.getSubject());
  }
}  