package com.zsy.frame.sample.java.control.designmode.structural.flyweight.gochess.withoutexternal;

//围棋棋子类：抽象享元类
abstract class IgoChessman {
  public abstract String getColor();

  public void display() {
    System.out.println("棋子颜色：" + this.getColor());
  }
}  