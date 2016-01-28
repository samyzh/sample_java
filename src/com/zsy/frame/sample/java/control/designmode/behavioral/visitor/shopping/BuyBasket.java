package com.zsy.frame.sample.java.control.designmode.behavioral.visitor.shopping;

import java.util.*;

//ObjectStructure: 对象结构
//对象结构存储了不同类型的元素对象，以供不同访问者访问
public class BuyBasket {
  private ArrayList list = new ArrayList();

  public void accept(Visitor visitor) {
    Iterator i = list.iterator();
    while (i.hasNext()) {
      ((Product) i.next()).accept(visitor);
    }
  }

  public void addProduct(Product product) {
    list.add(product);
  }

  public void removeProduct(Product product) {
    list.remove(product);
  }
}