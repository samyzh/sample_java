package com.zsy.frame.sample.java.control.designmode.behavioral.template.db;

class DBOperatorSubA extends DBOperator {
  public void connDB() {
    System.out.println("使用JDBC-ODBC桥接连接数据库");
  }
}