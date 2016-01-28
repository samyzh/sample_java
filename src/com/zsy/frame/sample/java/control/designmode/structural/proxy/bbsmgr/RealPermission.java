package com.zsy.frame.sample.java.control.designmode.structural.proxy.bbsmgr;

/**
 * (3) RealSubject（真实主题角色）：它定义了代理角色所代表的真实对象，在真实主题角色中实现了真实的业务操作，
 * 客户端可以通过代理主题角色间接调用真实主题角色中定义的操作
 */
public class RealPermission implements AbstractPermission {
  public void modifyUserInfo() {
    System.out.println("修改用户信息！");
  }

  public void viewNote() {
  }

  public void publishNote() {
    System.out.println("发布新帖！");
  }

  public void modifyNote() {
    System.out.println("修改发帖内容！");
  }

  public void setLevel(int level) {
  }
}