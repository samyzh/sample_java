package com.zsy.frame.sample.java.control.designmode.behavioral.template.hook;

public abstract class HookDemo {
  public abstract void getData();

  public void convertData() {
    System.out.println("通用的数据转换操作。");
  }

  public abstract void displayData();

  public void process() {
    getData();
    if (isValid()) {
      convertData();
    }
    displayData();
  }

  /**
   * 钩子方法可以与一些具体步骤“挂钩”
   */
  public boolean isValid() {
    return true;
  }
} 