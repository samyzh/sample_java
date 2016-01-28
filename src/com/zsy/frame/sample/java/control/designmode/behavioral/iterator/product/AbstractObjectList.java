package com.zsy.frame.sample.java.control.designmode.behavioral.iterator.product;

//在本实例中，为了详细说明自定义迭代器的实现过程，我们没有使用JDK中内置的迭代器，
// 事实上，JDK内置迭代器已经实现了对一个List对象的正向遍历

/**
 * 因此，可以考虑使用抽象类来设计抽象迭代器，在抽象类中为每一个方法提供一个空的默认实现。
 * 如果需要在具体迭代器中为聚合对象增加全新的遍历操作，则必须修改抽象迭代器和具体迭代器的源代码，
 * 这将违反“开闭原则”，因此在设计时要考虑全面，避免之后修改接口。
 */

import java.util.*;

//抽象聚合类  
abstract class AbstractObjectList {
  protected List<Object> objects = new ArrayList<Object>();

  public AbstractObjectList(List objects) {
    this.objects = objects;
  }

  public void addObject(Object obj) {
    this.objects.add(obj);
  }

  public void removeObject(Object obj) {
    this.objects.remove(obj);
  }

  public List getObjects() {
    return this.objects;
  }

  //声明创建迭代器对象的抽象工厂方法
  public abstract AbstractIterator createIterator();
}  