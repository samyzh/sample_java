package com.zsy.frame.sample.java.control.designmode.behavioral.template.db;

abstract class DBOperator {
  public abstract void connDB();

  public void openDB() {
    System.out.println("打开数据库");
  }

  public void useDB() {
    System.out.println("使用数据库");
  }

  public void closeDB() {
    System.out.println("关闭数据库");
  }

  public void process() {
    connDB();
    openDB();
    useDB();
    closeDB();
  }
} 