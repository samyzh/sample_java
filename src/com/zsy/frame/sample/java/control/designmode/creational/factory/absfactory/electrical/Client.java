package com.zsy.frame.sample.java.control.designmode.creational.factory.absfactory.electrical;

/**
 * 抽象工厂模式包含如下角色：
 * AbstractFactory：抽象工厂
 * ConcreteFactory：具体工厂
 * AbstractProduct：抽象产品
 * Product：具体产品
 */
public class Client {
  public static void main(String args[]) {
    try {
      EFactory factory;
      Television tv;
      AirConditioner ac;
      //         	factory=(EFactory)XMLUtil.getBean();
      factory = new TCLFactory();

      tv = factory.produceTelevision();
      tv.play();

      ac = factory.produceAirConditioner();
      ac.changeTemperature();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
