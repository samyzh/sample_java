package com.zsy.frame.sample.java.control.designmode.behavioral.chain.base;

public abstract class AbstractHandler {
  private Handler handler;

  public Handler getHandler() {
    return handler;
  }

  /**
   * 注入一个传递级别
   */
  public void setHandler(Handler handler) {
    this.handler = handler;
  }
}  