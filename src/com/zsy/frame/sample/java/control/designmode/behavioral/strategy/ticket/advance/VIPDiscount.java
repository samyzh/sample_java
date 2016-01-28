package com.zsy.frame.sample.java.control.designmode.behavioral.strategy.ticket.advance;

//VIP会员票折扣类：具体策略类
class VIPDiscount implements Discount {
  public double calculate(double price) {
    System.out.println("VIP票：");
    System.out.println("增加积分！");
    return price * 0.5;
  }
}  