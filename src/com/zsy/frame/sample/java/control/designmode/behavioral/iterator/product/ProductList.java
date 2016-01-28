package com.zsy.frame.sample.java.control.designmode.behavioral.iterator.product;

import java.util.List;

//商品数据类：具体聚合类
//注意这里已经是聚合new ProductIterator(this),而不是组合关系(外部迭代器)
class ProductList extends AbstractObjectList {
  public ProductList(List products) {
    super(products);
  }

  //实现创建迭代器对象的具体工厂方法
  public AbstractIterator createIterator() {
    return new ProductIterator(this);
  }
}   