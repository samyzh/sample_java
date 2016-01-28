package com.zsy.frame.sample.java.control.designmode.structural.flyweight.sharenetdev.withexternal;

/**
 * 抽象享元类
 * 抽象享元类声明一个接口，通过它可以接受并作用于外部状态
 */
public interface NetworkDevice {
  public String getType();

  public void use(Port port);
}