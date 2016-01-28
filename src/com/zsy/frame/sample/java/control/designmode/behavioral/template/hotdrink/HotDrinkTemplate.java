package com.zsy.frame.sample.java.control.designmode.behavioral.template.hotdrink;

/**
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-07 19:48
 */
public abstract class HotDrinkTemplate {

  //    注意的关键字final，表示子类不能修改这里的流程架构；
  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    //        是否要添加调料
    if (wantCondimentsHook()) {
      addCondiments();
    } else {
      System.out.println("No condiments");
    }
  }

  protected abstract void addCondiments();

  protected abstract void brew();

  private void boilWater() {
    System.out.println("Boiling Water");
  }

  private void pourInCup() {
    System.out.println("Pour into cup");
  }

  protected boolean wantCondimentsHook() {
    return true;
  }
}
