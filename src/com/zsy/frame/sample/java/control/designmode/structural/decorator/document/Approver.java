package com.zsy.frame.sample.java.control.designmode.structural.decorator.document;

//具体装饰类
class Approver extends Decorator {
  public Approver(Document document) {
    super(document);
    System.out.println("增加审批功能！");
  }

  public void approve() {
    System.out.println("审批文件！");
  }
}