package com.zsy.frame.sample.java.control.designmode.structural.composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * CakeHouseMenu菜单,下面没有二级菜单SubMenu
 * 存储结构为ArrayList，有自己的迭代器  menuItems.iterator(),
 */
public class CakeHouseMenu extends MenuComponent {
  private ArrayList<MenuComponent> menuItems;

  public CakeHouseMenu() {
    menuItems = new ArrayList<MenuComponent>();

    addItem("KFC Cake Breakfast", "boiled eggs&toast&cabbage", true, 3.99f);
    addItem("MDL Cake Breakfast", "fried eggs&toast", false, 3.59f);
    addItem("Stawberry Cake", "fresh stawberry", true, 3.29f);
    addItem("Regular Cake Breakfast", "toast&sausage", true, 2.59f);
  }

  private void addItem(String name, String description, boolean vegetable, float price) {
    MenuItem menuItem = new MenuItem(name, description, vegetable, price);
    menuItems.add(menuItem);
  }

  public Iterator getIterator() {
    return new ComposeIterator(menuItems.iterator());
  }

  @Override public void print() {
    System.out.println("****This is CakeHouseMenu****");
  }

  // 其他功能代码
}
