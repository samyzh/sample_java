package com.zsy.frame.sample.java.control.designmode.behavioral.command.undo;

/**
 * 具体的命令
 */
class ConcreteCommand extends AbstractCommand {
  private Adder adder = new Adder();
  private int value;

  public int execute(int value) {
    this.value = value;
    return adder.add(value);
  }

  public int undo() {
    return adder.add(-value);
  }
}