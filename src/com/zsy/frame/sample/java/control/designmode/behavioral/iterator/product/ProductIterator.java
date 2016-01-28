package com.zsy.frame.sample.java.control.designmode.behavioral.iterator.product;

import java.util.List;

//商品迭代器：具体迭代器
/**
 * 除了使用关联关系外，为了能够让迭代器可以访问到聚合对象中的数据，
 * 我们还可以将迭代器类设计为聚合类的内部类，JDK中的迭代器类就是通过这种方法来实现的
 */
class ProductIterator implements AbstractIterator {
  private ProductList productList;
  private List products;
  private int cursor1; //定义一个游标，用于记录正向遍历的位置
  private int cursor2; //定义一个游标，用于记录逆向遍历的位置

  public ProductIterator(ProductList list) {
    this.productList = list;
    this.products = list.getObjects(); //获取集合对象
    cursor1 = 0; //设置正向遍历游标的初始值
    cursor2 = products.size() - 1; //设置逆向遍历游标的初始值
  }

  public void next() {
    if (cursor1 < products.size()) {
      cursor1++;
    }
  }

  public boolean isLast() {
    return (cursor1 == products.size());
  }

  public void previous() {
    if (cursor2 > -1) {
      cursor2--;
    }
  }

  public boolean isFirst() {
    return (cursor2 == -1);
  }

  public Object getNextItem() {
    return products.get(cursor1);
  }

  public Object getPreviousItem() {
    return products.get(cursor2);
  }
}  