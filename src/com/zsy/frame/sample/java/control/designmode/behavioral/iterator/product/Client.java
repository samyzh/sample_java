package com.zsy.frame.sample.java.control.designmode.behavioral.iterator.product;

import java.util.ArrayList;
import java.util.List;

class Client {
  public static void main(String args[]) {
    List products = new ArrayList();
    products.add("倚天剑");
    products.add("屠龙刀");
    products.add("断肠草");
    products.add("葵花宝典");
    products.add("四十二章经");

    AbstractObjectList list;
    AbstractIterator iterator;
    /**
     *   无论使用哪种实现机制，客户端代码都是一样的，也就是说客户端无须关心具体迭代器对象的创建细节，
     *   只需通过调用工厂方法createIterator()即可得到一个可用的迭代器对象，
     *   这也是使用工厂方法模式的好处，通过工厂来封装对象的创建过程，简化了客户端的调用
     */
    //        list = new ProductList(products); //创建聚合对象
    list = new ProductList1(products); //创建聚合对象
    iterator = list.createIterator();   //创建迭代器对象

    System.out.println("正向遍历：");
    while (!iterator.isLast()) {
      System.out.print(iterator.getNextItem() + "，");
      iterator.next();
    }
    System.out.println();

    System.out.println("-----------------------------");
    System.out.println("逆向遍历：");
    while (!iterator.isFirst()) {
      System.out.print(iterator.getPreviousItem() + "，");
      iterator.previous();
    }
  }
}