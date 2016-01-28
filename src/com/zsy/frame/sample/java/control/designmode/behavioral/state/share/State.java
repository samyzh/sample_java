package com.zsy.frame.sample.java.control.designmode.behavioral.state.share;

/**
 * State: 抽象状态类
 * 状态模式的关键是引入了一个抽象类来专门表示对象的状态，这个类我们叫做抽象状态类，
 * 而对象的每一种具体状态类都继承了该类，并在不同具体状态类中实现了不同状态的行为，
 * 包括各种状态之间的转换
 */
abstract class State {
  public abstract void on(Switch s);

  public abstract void off(Switch s);
}