package com.zsy.frame.sample.java.control.designmode.structural.decorator.test;

//Decorator类是一个装饰类，可以为Source类动态的添加一些功能
public class Decorator implements Sourceable {
  private Sourceable source;

  public Decorator(Sourceable source) {
    super();
    this.source = source;
  }

  @Override public void method() {
    System.out.println("before decorator!");
    source.method();
    System.out.println("after decorator!");
  }
}  