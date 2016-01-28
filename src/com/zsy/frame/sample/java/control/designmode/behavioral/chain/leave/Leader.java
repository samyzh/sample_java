package com.zsy.frame.sample.java.control.designmode.behavioral.chain.leave;

/**
 * 可以把这个抽象类，分成接口(handleRequest)和抽象部分(拿到接口操作方法)注入信息
 */
public abstract class Leader {
  protected String name;
  protected Leader successor;

  public Leader(String name) {
    this.name = name;
  }

  public void setSuccessor(Leader successor) {
    this.successor = successor;
  }

  public abstract void handleRequest(LeaveRequest request);
}