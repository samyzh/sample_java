package com.zsy.frame.sample.java.control.designmode.behavioral.strategy.ticket.advance;

//学生票折扣类：具体策略类
class StudentDiscount implements Discount {
  public double calculate(double price) {
    System.out.println("学生票：");
    return price * 0.8;
  }
}  