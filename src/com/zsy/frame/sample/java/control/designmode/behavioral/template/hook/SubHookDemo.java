package com.zsy.frame.sample.java.control.designmode.behavioral.template.hook;

class SubHookDemo extends HookDemo {
  public void getData() {
    System.out.println("从XML配置文件中获取数据。");
  }

  public void displayData() {
    System.out.println("以柱状图显示数据。");
  }

  public boolean isValid() {
    return false;
  }
}
