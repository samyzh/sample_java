package com.zsy.frame.sample.java.control.designmode.creational.factory.absfactory.electrical;

public class TCLFactory implements EFactory {
  public Television produceTelevision() {
    return new TCLTelevision();
  }

  public AirConditioner produceAirConditioner() {
    return new TCLAirConditioner();
  }
}