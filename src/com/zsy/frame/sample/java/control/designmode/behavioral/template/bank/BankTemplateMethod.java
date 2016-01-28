package com.zsy.frame.sample.java.control.designmode.behavioral.template.bank;

public abstract class BankTemplateMethod {
  public void takeNumber() {
    System.out.println("取号排队。");
  }

  public abstract void transact();

  public void evaluate() {
    System.out.println("反馈评分。");
  }

  /**
   * 定死的工作流程
   */
  public void process() {
    this.takeNumber();
    this.transact();
    this.evaluate();
  }
} 