package com.zsy.frame.sample.java.control.designmode.creational.factory.factorymethod.tv;

/**
 * 工厂方法模式包含如下角色：
 * Product：抽象产品
 * ConcreteProduct：具体产品
 * Factory：抽象工厂
 * ConcreteFactory：具体工厂
 */
public class Client {
  public static void main(String args[]) {
    try {
      TV tv;
      TVFactory factory;
      //         	factory=(TVFactory)XMLUtil.getBean();
      factory = new HaierTVFactory();
      tv = factory.produceTV();
      tv.play();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
