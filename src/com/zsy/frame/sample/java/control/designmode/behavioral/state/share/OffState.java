package com.zsy.frame.sample.java.control.designmode.behavioral.state.share;

class OffState extends State {
  public void on(Switch s) {
    System.out.println("打开！");
    s.setState(Switch.getState("on"));
  }

  public void off(Switch s) {
    System.out.println("已经关闭！");
  }
}