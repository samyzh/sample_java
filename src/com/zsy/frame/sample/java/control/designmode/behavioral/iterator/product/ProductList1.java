package com.zsy.frame.sample.java.control.designmode.behavioral.iterator.product;

import java.util.List;

//商品数据类：具体聚合类
/**
 * 聚合对象只负责存储数据，而遍历数据由迭代器来完成(内部迭代器)
 *
 * 除了使用关联关系外，为了能够让迭代器可以访问到聚合对象中的数据，
 * 我们还可以将迭代器类设计为聚合类的内部类，JDK中的迭代器类就是通过这种方法来实现的
 */
class ProductList1 extends AbstractObjectList {
  public ProductList1(List products) {
    super(products);
  }

  public AbstractIterator createIterator() {
    return new ProductIterator();
  }

  //商品迭代器：具体迭代器，内部类实现
  private class ProductIterator implements AbstractIterator {
    private int cursor1;
    private int cursor2;

    public ProductIterator() {
      cursor1 = 0;
      cursor2 = objects.size() - 1;
    }

    public void next() {
      if (cursor1 < objects.size()) {
        cursor1++;
      }
    }

    public boolean isLast() {
      return (cursor1 == objects.size());
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
      return objects.get(cursor1);
    }

    public Object getPreviousItem() {
      return objects.get(cursor2);
    }
  }
}  