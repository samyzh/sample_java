package com.zsy.frame.sample.java.control.designmode.structural.adapter.classof.biorobot;

/**
 * 目标适配器类
 * 如果Robot接口里面就一个方法时，可以通过new 出来通过对象适配器实现(这样解耦更好操作)
 *
 * 在类适配器模式中，适配器类实现了目标抽象类接口并继承了适配者类，并在目标抽象类的实现方法中调用所继承的适配者类的方法；
 */
public class DogAdapter extends Dog implements Robot {
  /**
   * 目标抽象类的实现方法中调用所继承的适配者类的方法；在对象适配器模式中
   */
  public void cry() {
    System.out.print("机器人模仿：");
    super.wang();
  }

  public void move() {
    System.out.print("机器人模仿：");
    super.run();
  }
}