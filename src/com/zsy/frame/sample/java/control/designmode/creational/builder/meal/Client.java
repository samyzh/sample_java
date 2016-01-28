package com.zsy.frame.sample.java.control.designmode.creational.builder.meal;

/**
 * KFC套餐
 * 建造者模式可以用于描述KFC如何创建套餐：套餐是一个复杂对象，它一般包含主食（如汉堡、鸡肉卷等）和饮料（如果汁、可乐等）
 * 等组成部分，不同的套餐有不同的组成部分，而KFC的服务员可以根据顾客的要求，一步一步装配这些组成部分，
 * 构造一份完整的套餐，然后返回给顾客。
 */
public class Client {
  public static void main(String args[]) {
    //动态确定套餐种类
    //	    MealBuilder mb=(MealBuilder)XMLUtil.getBean();
    MealBuilder mb = new SubMealBuilderA();
    //	    MealBuilder mb=new SubMealBuilderB();
    //服务员是指挥者
    KFCWaiter waiter = new KFCWaiter();
    //服务员准备套餐 通过指挥者创建完整的建造者对象
    waiter.setMealBuilder(mb);
    //客户获得套餐
    Meal meal = waiter.construct();

    System.out.println("套餐组成：");
    System.out.println(meal.getFood());
    System.out.println(meal.getDrink());
  }
}
