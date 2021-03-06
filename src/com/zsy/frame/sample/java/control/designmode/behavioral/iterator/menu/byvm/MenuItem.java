package com.zsy.frame.sample.java.control.designmode.behavioral.iterator.menu.byvm;

public class MenuItem {
  private String name, description;
  private boolean vegetable;
  private float price;

  public MenuItem(String name, String description, boolean vegetable, float price) {
    this.name = name;
    this.description = description;
    this.vegetable = vegetable;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public float getPrice() {
    return price;
  }

  public boolean isVegetable() {
    return vegetable;
  }
}
