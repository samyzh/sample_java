package com.zsy.frame.sample.java.control.designmode.behavioral.chain.purchase;

/**
 * 另外添加
 * 由于链的创建过程由客户端负责，因此增加新的具体处理者类对原有类库无任何影响，无须修改已有类的源代码，符合“开闭原则”。
 */
//经理类：具体处理者
class Manager extends Approver {
  public Manager(String name) {
    super(name);
  }

  //具体请求处理方法
  public void processRequest(PurchaseRequest request) {
    if (request.getAmount() < 80000) {
      System.out.println(
          "经理" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount()
              + "元，采购目的：" + request.getPurpose() + "。");  //处理请求
    } else {
      this.successor.processRequest(request);  //转发请求
    }
  }
}