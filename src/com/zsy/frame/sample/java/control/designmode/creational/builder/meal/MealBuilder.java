package com.zsy.frame.sample.java.control.designmode.creational.builder.meal;

/**
 * Builder（抽象建造者）
 */
public abstract class MealBuilder {
  protected Meal meal = new Meal();

  public abstract void buildFood();

  public abstract void buildDrink();

  public Meal getMeal() {
    //工厂方法，返回一个完整的产品角色
    return meal;
  }
}