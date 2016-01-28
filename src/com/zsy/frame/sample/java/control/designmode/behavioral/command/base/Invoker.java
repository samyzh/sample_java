package com.zsy.frame.sample.java.control.designmode.behavioral.command.base;

public class Invoker {
  private Command command;

  public Invoker(Command command) {
    this.command = command;
  }

  public void action() {
    command.exe();
  }
} 