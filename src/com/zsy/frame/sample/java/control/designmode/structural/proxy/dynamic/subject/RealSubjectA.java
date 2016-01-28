package com.zsy.frame.sample.java.control.designmode.structural.proxy.dynamic.subject;

/**
 * 真实主题角色定义了代理角色所代表的真实对象，在真实主题角色中实现了真实的业务操作，
 * 客户端可以通过代理主题角色间接调用真实主题角色中定义的方法
 */
public class RealSubjectA implements AbstractSubject {
  public void request() {
    System.out.println("真实主题类A！");
  }
}