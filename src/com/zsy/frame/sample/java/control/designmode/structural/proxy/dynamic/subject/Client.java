package com.zsy.frame.sample.java.control.designmode.structural.proxy.dynamic.subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 客户端可以通过代理主题角色间接调用真实主题角色中定义的方法
 *
 * 动态代理
 * 动态代理是一种较为高级的代理模式，它的典型应用就是Spring AOP
 * 在传统的代理模式中，客户端通过Proxy调用RealSubject类的request()方法，同时还在代理类中封装了其他方法(如preRequest()和postRequest())，可以处理一些其他问题
 * 如果按照这种方法使用代理模式，那么真实主题角色必须是事先已经存在的，并将其作为代理对象的内部成员属性
 * 如果一个真实主题角色必须对应一个代理主题角色，这将导致系统中的类个数急剧增加，因此需要想办法减少系统中类的个数
 * 此外，如何在事先不知道真实主题角色的情况下使用代理主题角色，这都是动态代理需要解决的问题。
 * Java动态代理实现相关类位于java.lang.reflect包，主要涉及两个类：
 * InvocationHandler接口。它是代理实例的调用处理程序实现的接口，该接口中定义了如下方法：public Object invoke (Object proxy, Method
 * method, Object[] args) throws Throwable;
 * Proxy类。该类即为动态代理类，该类最常用的方法为：public static Object newProxyInstance(ClassLoader loader, Class<?>[]
 * interfaces, InvocationHandler h) throws IllegalArgumentException。
 * 代理模式包含三个角色
 * 抽象主题角色声明了真实主题和代理主题的共同接口；
 * 代理主题角色内部包含对真实主题的引用，从而可以在任何时候操作真实主题对象
 * 真实主题角色定义了代理角色所代表的真实对象，在真实主题角色中实现了真实的业务操作，客户端可以通过代理主题角色间接调用真实主题角色中定义的方法
 * 如：约会服务系统代码讲解
 */
public class Client {
  public static void main(String args[]) {
    InvocationHandler handler = null;
    AbstractSubject subject = null;

    handler = new DynamicProxy(new RealSubjectA());
    // Proxy类。该类即为动态代理类，该类最常用的方法为：public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
    // throws IllegalArgumentException。newProxyInstance()方法用于根据传入的接口类型interfaces返回一个动态创建的代理类的实例，
    // 方法中第一个参数loader表示代理类的类加载器，第二个参数interfaces表示代理类实现的接口列表（与真实主题类的接口列表一致），
    // 第三个参数h表示所指派的调用处理程序类。
    subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),
        new Class[] { AbstractSubject.class }, handler);
    subject.request();

    System.out.println("------------------------------");

    handler = new DynamicProxy(new RealSubjectB());
    subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),
        new Class[] { AbstractSubject.class }, handler);
    subject.request();
  }
}