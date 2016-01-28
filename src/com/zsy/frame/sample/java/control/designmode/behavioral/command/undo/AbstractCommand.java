package com.zsy.frame.sample.java.control.designmode.behavioral.command.undo;

abstract class AbstractCommand {
  public abstract int execute(int value);

  public abstract int undo();
}