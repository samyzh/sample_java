package com.zsy.frame.sample.java.control.designmode.behavioral.command.tv;

public class TVCloseCommand implements AbstractCommand {
  private Television tv;

  public TVCloseCommand() {
    tv = new Television();
  }

  public void execute() {
    tv.close();
  }
}