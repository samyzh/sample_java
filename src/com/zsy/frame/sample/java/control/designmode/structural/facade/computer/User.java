package com.zsy.frame.sample.java.control.designmode.structural.facade.computer;

public class User {

  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.startup();
    computer.shutdown();
  }
}  