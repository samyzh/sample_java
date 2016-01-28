package com.zsy.frame.sample.java.control.designmode.behavioral.visitor.base;

public interface Subject {
  public void accept(Visitor visitor);

  public String getSubject();
} 