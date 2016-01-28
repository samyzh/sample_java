package com.zsy.frame.sample.java.control.designmode.creational.singleton.base;

/**
 * 饿汉式单例类.在类初始化时，已经自行实例化;
 * 饿汉式是典型的空间换时间
 *
 * 懒汉式单例与饿汉式单例比较
 * 单从资源利用效率角度来讲，这个比懒汉式单例类稍差些。从速度和反应时间角度来讲，则比懒汉式单例类稍好些
 * 懒汉式单例类在实例化时，必须处理好在多个线程同时首次引用此类时的访问限制问题，特别是当单例类作为资源控制器
 * 在实例化时必然涉及资源初始化，而资源初始化很有可能耗费大量时间，这意味着出现多线程同时首次引用此类的机率变得较大，需要通过同步化机制进行控制
 */
public class EagerSingleton {
  private EagerSingleton() {
  }//私有的默认构造

  private static EagerSingleton instance = new EagerSingleton(); //已经自行实例化

  public static EagerSingleton getInstance() {//静态工厂方法
    return instance;
  }
}