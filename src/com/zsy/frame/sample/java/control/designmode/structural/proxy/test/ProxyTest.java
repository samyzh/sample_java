package com.zsy.frame.sample.java.control.designmode.structural.proxy.test;

/**
 * 这种跟装饰器的对象适配模式很类似
 * ======================================
 * 代理模式和装饰者模式差异
 * 装饰者模式，装饰以后会添加新功能
 * 代理模式目的是对目标对象访问的控制和管理
 */
public class ProxyTest {

  public static void main(String[] args) {
    Sourceable source = new Proxy();
    source.method();
  }
} 