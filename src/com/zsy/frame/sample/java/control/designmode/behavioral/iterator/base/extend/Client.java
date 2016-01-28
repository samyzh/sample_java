package com.zsy.frame.sample.java.control.designmode.behavioral.iterator.base.extend;

class Client {
  public static void process(MyCollection collection) {
    MyIterator i = collection.createIterator();

    while (!i.isLast()) {
      System.out.println(i.currentItem().toString());
      i.next();
    }
  }

  public static void main(String a[]) {
    MyCollection collection = new NewCollection();
    process(collection);
  }
}