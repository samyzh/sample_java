package com.zsy.frame.sample.java.control.designmode.behavioral.iterator.menu.byvm;

/**
 * 重新设计菜单项目
 * 又合并一家咖啡馆
 * 用Java自带的迭代器，
 * Collection (List, set )多有 menuItems.iterator()，map自带的在.values上menuItems.values().iterator()，
 * 数组得自己去实现迭代器,同时实现java自带的Iterator接口实现
 */
public class MainTest {
  public static void main(String[] args) {
    Waitress mWaitress = new Waitress();
    CakeHouseMenu mCakeHouseMenu = new CakeHouseMenu();
    DinerMenu mDinerMenu = new DinerMenu();
    CafeMenu mCafeMenu = new CafeMenu();

    mWaitress.addIterator(mCakeHouseMenu.getIterator());
    mWaitress.addIterator(mDinerMenu.getIterator());
    mWaitress.addIterator(mCafeMenu.getIterator());
    mWaitress.printMenu();
  }
}
