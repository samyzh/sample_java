package com.zsy.frame.sample.java.control.designmode.behavioral.template.db;

/**
 * 对数据库的操作一般包括连接、打开、使用、关闭等步骤，在数据库操作模板类中我们定义了connDB()、openDB()、useDB()、closeDB()
 * 四个方法分别对应这四个步骤。对于不同类型的数据库（如SQL Server和Oracle），其操作步骤都一致，
 * 只是连接数据库connDB()方法有所区别，现使用模板方法模式对其进行设计。
 */
class Client {
  public static void main(String a[]) {
    DBOperator db1;

    db1 = new DBOperatorSubA();
    db1.process();
    System.out.println("---------------------------------------");
    db1 = new DBOperatorSubB();
    db1.process();
  }
}
