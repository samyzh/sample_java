package com.zsy.frame.sample.java.control.designmode.creational.builder.meal;

/**
 * ConcreteBuilder（具体建造者）
 */
public class SubMealBuilderA extends MealBuilder
{
    public void buildFood()
    {
        meal.setFood("一个鸡腿堡");
    }
    public void buildDrink()
    {
        meal.setDrink("一杯可乐");
    }
}