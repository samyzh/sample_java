package com.zsy.frame.sample.java.control.designmode.behavioral.command.tv;

public class TVOpenCommand implements AbstractCommand {
  private Television tv;

  public TVOpenCommand() {
    // 电视机是请求的接收者
    // 定义请求接收者
    tv = new Television();
  }

  public void execute() {
    tv.open();
  }
}