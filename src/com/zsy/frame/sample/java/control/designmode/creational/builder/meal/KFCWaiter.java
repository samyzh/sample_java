package com.zsy.frame.sample.java.control.designmode.creational.builder.meal;

/**
 * Director（指挥者）
 */
public class KFCWaiter {
  private MealBuilder mb;

  //可以省略这部，可以直接通过构造来抽象建造者传递过来
  public void setMealBuilder(MealBuilder mb) {
    this.mb = mb;
  }

  public Meal construct() {
    //        MealBuilder mb;
    //        Meal meal;
    mb.buildFood();
    mb.buildDrink();
    //        meal = mb.getMeal();
    return mb.getMeal();
  }
}