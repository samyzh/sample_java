package com.zsy.frame.sample.java.control.designmode.behavioral.command.tv;

public class TVChangeCommand implements AbstractCommand {
  private Television tv;

  public TVChangeCommand() {
    tv = new Television();
  }

  public void execute() {
    tv.changeChannel();
  }
}