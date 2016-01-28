package com.zsy.frame.sample.java.control.designmode.creational.singleton.base;

/**
 * 懒汉模式的静态内部类
 * Initialization Demand Holder (IoDH)的技术。
 * 通过使用IoDH，我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为一种最好的Java语言单例模式实现方式（其缺点是与编程语言本身的特性相关，很多面向对象语言不支持IoDH）
 *
 * 多线程问题优化三：
 * 懒汉模式的静态内部类
 * 实现
 * public class Singleton {
 * 这种比上面1、2都好一些，既实现了线程安全，又避免了同步带来的性能影响
 * private Singleton(){}
 *
 * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
 * 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
 *
 * 优缺点
 * 通过使用IoDH，我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为一种最好的Java语言单例模式实现方式（其缺点是与编程语言本身的特性相关，很多面向对象语言不支持IoDH）
 * 第3种，利用了classloader的机制来保证初始化instance时只有一个线程，所以也是线程安全的，同时没有性能损耗，所以一般我倾向于使用这一种。
 * 　　当getInstance方法第一次被调用的时候，它第一次读取SingletonHolder.instance，导致SingletonHolder类得到初始化；而这个类在装载并被初始化的时候，会初始化它的静态域，从而创建Singleton的实例，由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性。
 * 　　这个模式的优势在于，getInstance方法并没有被同步，并且只是执行一个域的访问，因此延迟初始化并没有增加任何访问成本。
 **/

import java.util.Map;

/**
 * 当getInstance方法第一次被调用的时候，它第一次读取SingletonHolder.instance，导致SingletonHolder类得到初始化；
 * 而这个类在装载并被初始化的时候，会初始化它的静态域，从而创建Singleton的实例，由于是静态的域，
 * 因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性。
 * 这个模式的优势在于，getInstance方法并没有被同步，并且只是执行一个域的访问，因此延迟初始化并没有增加任何访问成本。
 */
class LazySingletonGood {
  private LazySingletonGood() {
  }


  private static class SingletonHolder {
    private final static LazySingletonGood instance = new LazySingletonGood();
  }

  public static LazySingletonGood getInstance() {
    return SingletonHolder.instance;
  }

  public static void main(String args[]) {
    LazySingletonGood s1, s2;
    s1 = LazySingletonGood.getInstance();
    s2 = LazySingletonGood.getInstance();
    System.out.println(s1 == s2);
  }

  /**
   * 方式四 : 枚举单例, 线程安全
   */
  enum SingletonEnum {
    INSTANCE;
    public void doSomething() {
      System.out.println("do sth.");
    }
  }
  /**
   * 方式五 : 注册到容器, 根据key获取对象.一般都会有多种相同属性类型的对象会注册到一个map中
   * instance容器
   */
  //private static Map<String singleton=""> objMap = new HashMap<String singleton="">();
  ///**
  // * 注册对象到map中
  // * @param key
  // * @param instance
  // */
  //public static void registerService(String key, LazySingletonGood instance) {
  //  if (!objMap.containsKey(key) ) {
  //    objMap.put(key, instance) ;
  //  }
  //}
  //
  ///**
  // * 根据key获取对象
  // * @param key
  // * @return
  // */
  //public static LazySingletonGood getService(String key) {
  //  return objMap.get(key) ;
  //}

}  