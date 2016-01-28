package com.zsy.frame.sample.java.control.designmode.structural.composite.menu;

import java.util.Iterator;

/**
 * DinerMenu菜单，下面有二级菜单SubMenu
 * 数组MenuComponent[],没有自己的迭代器,用自定义的一个DinerIterator
 */
public class DinerMenu extends MenuComponent {
  private final static int Max_Items = 5;
  private int numberOfItems = 0;
  private MenuComponent[] menuItems;

  public DinerMenu() {
    menuItems = new MenuComponent[Max_Items];
    addItem("vegetable Blt", "bacon&lettuce&tomato&cabbage", true, 3.58f);
    addItem("Blt", "bacon&lettuce&tomato", false, 3.00f);
    addItem("bean soup", "bean&potato salad", true, 3.28f);
    addItem("hotdog", "onions&cheese&bread", false, 3.05f);
    addSubMenu(new SubMenu());
  }

  private void addItem(String name, String description, boolean vegetable, float price) {
    MenuItem menuItem = new MenuItem(name, description, vegetable, price);
    if (numberOfItems >= Max_Items) {
      System.err.println("sorry,menu is full!can not add another item");
    } else {
      menuItems[numberOfItems] = menuItem;
      numberOfItems++;
    }
  }

  private void addSubMenu(MenuComponent mMenuComponent) {
    if (numberOfItems >= Max_Items) {
      System.err.println("sorry,menu is full!can not add another item");
    } else {
      menuItems[numberOfItems] = mMenuComponent;
      numberOfItems++;
    }
  }

  public Iterator getIterator() {
    return new ComposeIterator(new DinerIterator());
  }

  class DinerIterator implements Iterator {
    private int position;

    public DinerIterator() {
      position = 0;
    }

    @Override public boolean hasNext() {
      if (position < numberOfItems) {
        return true;
      }
      return false;
    }

    @Override public Object next() {
      MenuComponent menuItem = menuItems[position];
      position++;
      return menuItem;
    }

    @Override public void remove() {
    }
  }

  @Override public void print() {
    System.out.println("****This is DinerMenu****");
  }
}
