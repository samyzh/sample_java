package com.zsy.frame.sample.java.control.designmode.creational.singleton.base;

/**
 * 多线程问题优化一：
 * 实现
 * 同步(synchronied) getinstance 方法(懒汉式单例类优化synchronized)
 * 优缺点
 * 第1种，在方法调用上加了同步，虽然线程安全了，但是每次都要同步，会影响性能，毕竟99%的情况下是不需要同步的，
 *
 * 多线程问题优化二：
 * 双重检查加锁(改进后的代码)
 * 实现
 * public volatile static ChocolateFactory uniqueInstance = null;
 * public static ChocolateFactory getInstance() {
 * if (uniqueInstance == null) {//先检查实例是否存在，如果不存在才进入下面的同步块
 * synchronized (ChocolateFactory.class) {//同步块，线程安全的创建实例
 * if (uniqueInstance == null) {  //再次检查实例是否存在，如果不存在才真正的创建实例
 * uniqueInstance = new ChocolateFactory();
 * }}}
 * return uniqueInstance;
 * }
 * 优缺点
 * “双重检查加锁”机制的实现会使用关键字volatile，它的意思是：被volatile修饰的变量的值，将不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存，从而确保多个线程能正确的处理该变量
 * 注意：在java1.4及以前版本中，很多JVM对于volatile关键字的实现的问题，会导致“双重检查加锁”的失败，因此“双重检查加锁”机制只只能用在java5及以上的版本。
 * 提示：由于volatile关键字可能会屏蔽掉虚拟机中一些必要的代码优化，所以运行效率并不是很高。因此一般建议，没有特别的需要，不要使用。
 * 也就是说，虽然可以使用“双重检查加锁”机制来实现线程安全的单例，但并不建议大量采用，可以根据情况来选用。
 * 第2种，在getInstance中做了两次null检查，确保了只有第一次调用单例的时候才会做同步，这样也是线程安全的，同时避免了每次都同步的性能损耗
 * 可以既实现线程安全，又能够使性能不受很大的影响;这种实现方式既可以实现线程安全地创建实例，而又不会对性能造成太大的影响。它只是第一次创建实例的时候同步，以后就不需要同步了，从而加快了运行速度。
 *
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-12-07 21:22
 */
public class LazySingletonAavnce {

  //最原始一种情况
  //private LazySingletonAavnce() {
  //}//私有的默认构造
  //
  //private static LazySingletonAavnce instance = null;//注意，这里没有final
  //
  //public static LazySingletonAavnce getInstance() {//静态工厂方法
  //  if (instance == null) {
  //    instance = new LazySingletonAavnce();
  //  }
  //  return instance;
  //}

  ////多线程问题优化一
  //private LazySingletonAavnce() {
  //}//私有的默认构造
  //
  //private static LazySingletonAavnce instance = null;//注意，这里没有final
  //
  //public synchronized static LazySingletonAavnce getInstance() {//静态工厂方法
  //  if (instance == null) {
  //    instance = new LazySingletonAavnce();
  //  }
  //  return instance;
  //}

  ////多线程问题优化二
  public volatile static LazySingletonAavnce uniqueInstance = null;

  public static LazySingletonAavnce getInstance() {
    if (uniqueInstance == null) {//先检查实例是否存在，如果不存在才进入下面的同步块
      synchronized (LazySingletonAavnce.class) {//同步块，线程安全的创建实例
        if (uniqueInstance == null) {  //再次检查实例是否存在，如果不存在才真正的创建实例
          uniqueInstance = new LazySingletonAavnce();
        }
      }
    }
    return uniqueInstance;
  }
}
