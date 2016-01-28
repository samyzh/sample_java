package com.zsy.frame.sample.java.control.designmode.creational.singleton.base;

/**
 * 懒汉式单例类.在第一次调用的时候实例化
 * 懒汉式是典型的时间换空间
 */
public class LazySingleton {
  private LazySingleton() {
  }//私有的默认构造

  private static LazySingleton instance = null;//注意，这里没有final

  public static LazySingleton getInstance() {//静态工厂方法
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }
}