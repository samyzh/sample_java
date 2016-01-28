package com.zsy.frame.sample.java.control.designmode.structural.bridge.pen;

/**
 * 就通过对Pen(Bridge)类的调用，实现了对接口Color的实现类***Color的调用
 */
public abstract class Pen {
  /**
   * 在抽象类Abstraction中定义了一个实现类接口类型的成员对象impl，再通过注入的方式给该对象赋值，
   * 一般将该对象的可见性定义为protected，以便在其子类中访问Implementor的方法
   */
  protected Color color;

  public void setColor(Color color) {
    this.color = color;
  }

  public abstract void draw(String name);
} 