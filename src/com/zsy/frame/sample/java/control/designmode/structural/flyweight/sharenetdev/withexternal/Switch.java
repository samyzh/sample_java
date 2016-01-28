package com.zsy.frame.sample.java.control.designmode.structural.flyweight.sharenetdev.withexternal;

/**
 * 具体享元类
 *
 * 具体享元类实现了抽象享元接口，其实例称为享元对象
 */
public class Switch implements NetworkDevice {
  private String type;

  public Switch(String type) {
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

  public void use(Port port) {
    System.out.println("Linked by switch, type is " + this.type + ", port is " + port.getPort());
  }
}