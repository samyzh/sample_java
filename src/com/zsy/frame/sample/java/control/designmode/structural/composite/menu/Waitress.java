package com.zsy.frame.sample.java.control.designmode.structural.composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 处理的场景:一个餐厅合并了另一个餐厅，期间服务员要把现在餐厅的菜单全部打印出来
 */
public class Waitress {
  /**
   * ArrayList自身有自带的迭代器,数组没有迭代器要我们自己的创建一个，HashMap中的values也有自带的迭代器
   */
  private ArrayList<MenuComponent> iterators = new ArrayList<MenuComponent>();

  public Waitress() {
  }

  public void addComponent(MenuComponent mMenuComponent) {
    iterators.add(mMenuComponent);
  }

  /**
   * 遍历菜单
   */
  public void printMenu() {
    Iterator iterator;
    MenuComponent menuItem;
    for (int i = 0, len = iterators.size(); i < len; i++) {
      iterators.get(i).print();
      iterator = iterators.get(i).getIterator();

      while (iterator.hasNext()) {
        menuItem = (MenuComponent) iterator.next();
        menuItem.print();
      }
    }
  }

  public void printBreakfastMenu() {
  }

  public void printLunchMenu() {
  }

  public void printVegetableMenu() {
    Iterator iterator;
    MenuComponent menuItem;
    for (int i = 0, len = iterators.size(); i < len; i++) {
      iterators.get(i).print();
      iterator = iterators.get(i).getIterator();

      while (iterator.hasNext()) {
        menuItem = (MenuComponent) iterator.next();
        if (menuItem.isVegetable()) {
          menuItem.print();
        }
      }
    }
  }
}
