package com.zsy.frame.sample.java.control.designmode.structural.flyweight.gochess.withexternal;

/**
 * 享元类的设计是享元模式的要点之一，在享元类中要将内部状态和外部状态分开处理，
 * 通常将内部状态作为享元类的成员变量，而外部状态通过注入的方式添加到享元类中
 */
//围棋棋子类：抽象享元类
abstract class IgoChessman {
  public abstract String getColor();

  //    public void display() {
  //        System.out.println("棋子颜色：" + this.getColor());
  //    }
  public void display(Coordinates coord) {
    System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY());
  }
}  