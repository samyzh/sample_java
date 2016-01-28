package com.zsy.frame.sample.java.control.designmode.structural.bridge.pen;

public class White implements Color {
  public void bepaint(String penType, String name) {
    System.out.println(penType + "白色的" + name + ".");
  }
}