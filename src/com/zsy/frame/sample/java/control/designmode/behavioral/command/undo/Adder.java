package com.zsy.frame.sample.java.control.designmode.behavioral.command.undo;

class Adder {
  private int num = 0;

  public int add(int value) {
    num += value;
    return num;
  }
}