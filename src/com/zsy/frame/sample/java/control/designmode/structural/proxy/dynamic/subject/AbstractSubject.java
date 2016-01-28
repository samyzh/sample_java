package com.zsy.frame.sample.java.control.designmode.structural.proxy.dynamic.subject;

/**
 * 抽象主题角色声明了真实主题和代理主题的共同接口
 * 客户端可以通过代理主题角色间接调用真实主题角色中定义的方法
 */
public interface AbstractSubject {
  public void request();
}