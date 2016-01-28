package com.zsy.frame.sample.java.control.designmode.behavioral.visitor.shopping;

//Element: 抽象元素
public interface Product {
  void accept(Visitor visitor);
}