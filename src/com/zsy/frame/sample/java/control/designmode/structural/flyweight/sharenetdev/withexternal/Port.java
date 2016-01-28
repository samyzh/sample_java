package com.zsy.frame.sample.java.control.designmode.structural.flyweight.sharenetdev.withexternal;

/**
 * 非共享具体享元类
 *
 * 非共享具体享元是不能被共享的抽象享元类的子类
 */
public class Port {
  private String port;

  public Port(String port) {
    this.port = port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public String getPort() {
    return this.port;
  }
}