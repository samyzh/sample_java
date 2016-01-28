package com.zsy.frame.sample.java.control.designmode.structural.proxy.dynamic.subject;

/**
 * 真实主题角色定义了代理角色所代表的真实对象，在真实主题角色中实现了真实的业务操作，
 */
public class RealSubjectB implements AbstractSubject {
  public void request() {
    System.out.println("真实主题类B！");
  }
}