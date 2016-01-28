package com.zsy.frame.sample.java.control.designmode.behavioral.strategy.ticket.advance;

//折扣类：抽象策略类
interface Discount {
  public double calculate(double price);
}  