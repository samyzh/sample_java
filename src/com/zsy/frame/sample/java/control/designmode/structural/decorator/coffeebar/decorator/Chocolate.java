package com.zsy.frame.sample.java.control.designmode.structural.decorator.coffeebar.decorator;

import com.zsy.frame.sample.java.control.designmode.structural.decorator.coffeebar.Drink;

public class Chocolate extends Decorator {

  public Chocolate(Drink obj) {
    super(obj);
    // TODO Auto-generated constructor stub
    super.setDescription("Chocolate");
    super.setPrice(3.0f);
  }
}
