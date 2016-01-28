package com.zsy.frame.sample.java.control.designmode.behavioral.strategy.ticket.advance;

///儿童票折扣类：具体策略类
class ChildrenDiscount implements Discount {
  public double calculate(double price) {
    System.out.println("儿童票：");
    return price - 10;
  }
}   