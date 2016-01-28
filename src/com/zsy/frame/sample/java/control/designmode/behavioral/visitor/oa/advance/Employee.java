package com.zsy.frame.sample.java.control.designmode.behavioral.visitor.oa.advance;

//员工类：抽象元素类
interface Employee {
  public void accept(Department handler); //接受一个抽象访问者访问
}  