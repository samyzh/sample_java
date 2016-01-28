package com.zsy.frame.sample.java.control.designmode.structural.proxy.bbsmgr;

/**
 * (2) Proxy（代理主题角色）：它包含了对真实主题的引用，从而可以在任何时候操作真实主题对象
 * 在代理主题角色中提供一个与真实主题角色相同的接口，以便在任何时候都可以替代真实主题；
 * 代理主题角色还可以控制对真实主题的使用，负责在需要的时候创建和删除真实主题对象，并对真实主题对象的使用加以约束
 */
public class PermissionProxy implements AbstractPermission {
  private RealPermission permission = new RealPermission();
  private int level = 0;

  public void setLevel(int level) {
    this.level = level;
  }

  public void modifyUserInfo() {
    if (0 == level) {
      System.out.println("对不起，你没有该权限!");
    } else if (1 == level) {
      permission.modifyUserInfo();
    }
  }

  public void viewNote() {
    System.out.println("查看帖子！");
  }

  public void publishNote() {
    if (0 == level) {
      System.out.println("对不起，你没有该权限!");
    } else if (1 == level) {
      permission.publishNote();
    }
  }

  public void modifyNote() {
    if (0 == level) {
      System.out.println("对不起，你没有该权限!");
    } else if (1 == level) {
      permission.modifyNote();
    }
  }
}