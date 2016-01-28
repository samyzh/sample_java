package com.zsy.frame.sample.java.control.designmode.structural.decorator.coffeebar.decorator;

import com.zsy.frame.sample.java.control.designmode.structural.decorator.coffeebar.Drink;

public class Decorator extends Drink {
  private Drink obj;

  public Decorator(Drink Obj) {
    this.obj = Obj;
  }

  @Override public float cost() {
    // TODO Auto-generated method stub
    return super.getPrice() + obj.cost();
  }

  @Override public String getDescription() {
    return super.description + "-" + super.getPrice() + "&&" + obj.getDescription();
  }
}
