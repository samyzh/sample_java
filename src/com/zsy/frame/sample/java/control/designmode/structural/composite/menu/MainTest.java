package com.zsy.frame.sample.java.control.designmode.structural.composite.menu;

/**
 * 客户叫服务员点菜单;
 * 这个场景和应用有点复杂
 */
public class MainTest {
  public static void main(String[] args) {
    Waitress mWaitress = new Waitress();

    CakeHouseMenu mCakeHouseMenu = new CakeHouseMenu();
    DinerMenu mDinerMenu = new DinerMenu();
    mWaitress.addComponent(mCakeHouseMenu);
    mWaitress.addComponent(mDinerMenu);

    mWaitress.printVegetableMenu();
  }
}
