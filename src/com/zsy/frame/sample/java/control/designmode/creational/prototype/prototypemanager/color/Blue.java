package com.zsy.frame.sample.java.control.designmode.creational.prototype.prototypemanager.color;

class Blue implements MyColor {
  public Object clone() {
    Blue b = null;
    try {
      b = (Blue) super.clone();
    } catch (CloneNotSupportedException e) {

    }
    return b;
  }

  public void display() {
    System.out.println("This is Blue!");
  }
}