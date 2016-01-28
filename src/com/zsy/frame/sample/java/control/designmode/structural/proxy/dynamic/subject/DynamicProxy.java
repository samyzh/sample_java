package com.zsy.frame.sample.java.control.designmode.structural.proxy.dynamic.subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 代理主题角色内部包含对真实主题的引用，从而可以在任何时候操作真实主题对象；
 */
public class DynamicProxy implements InvocationHandler {
  private Object obj;

  public DynamicProxy() {
  }

  public DynamicProxy(Object obj) {
    this.obj = obj;
  }

  //    InvocationHandler接口。它是代理实例的调用处理程序实现的接口，该接口中定义了如下方法：
  // public Object invoke (Object proxy, Method method, Object[] args) throws Throwable;
  // invoke()方法中第一个参数proxy表示代理类，第二个参数method表示需要代理的方法，第三个参数args表示代理方法的参数数组。
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    preRequest();
    method.invoke(obj, args);
    postRequest();
    return null;
  }

  public void preRequest() {
    System.out.println("调用之前！");
  }

  public void postRequest() {
    System.out.println("调用之后！");
  }
}