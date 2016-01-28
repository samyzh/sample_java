package com.zsy.frame.sample.java.control.designmode.structural.decorator.document;

/**
 * 半透明装修模式
 * <p>
 * 采购单(PurchaseRequest)和请假条(LeaveRequest)等文件(Document)对象都具有显示功能，现在要为其增加审批、删除等功能，
 * 使用装饰模式进行设计。
 * <p>
 * 如果newDoc也使用Document类型来定义，将导致客户端无法调用新增业务方法approve()，因为在抽象构件类Document中没有对approve()方法的声明。
 * 也就是说，在客户端无法统一对待装饰之前的具体构件对象和装饰之后的构件对象。
 * <p>
 * 在实际使用过程中，由于新增行为可能需要单独调用，因此这种形式的装饰模式也经常出现，这种装饰模式被称为半透明(Semi-transparent)装饰模式，
 * 而标准的装饰模式是透明(Transparent)装饰模式。
 *
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-05 17:37
 */
public class Client {
  public static void main(String args[]) {
    Document doc; //使用抽象构件类型定义
    doc = new PurchaseRequest();

    Approver newDoc; //使用具体装饰类型定义
    newDoc = new Approver(doc);

    newDoc.display();//调用原有业务方法
    newDoc.approve();//调用新增业务方法
  }
}
