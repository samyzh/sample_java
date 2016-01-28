package com.zsy.frame.sample.java.control.designmode.structural.proxy.candymachine.base;

import java.io.Serializable;

public interface State extends Serializable {
  public void insertCoin();

  public void returnCoin();

  public void turnCrank();

  public void dispense();

  public void printstate();

  public String getstatename();
}
