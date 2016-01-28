package com.zsy.frame.sample.java.control.designmode.behavioral.chain.purchase;

/**
 * 公司承接了某企业SCM(Supply Chain Management，供应链管理)系统的开发任务，其中包含一个采购审批子系统。
 * 该企业的采购审批是分级进行的，即根据采购金额的不同由不同层次的主管人员来审批，
 * 主任可以审批5万元以下（不包括5万元）的采购单，副董事长可以审批5万元至10万元（不包括10万元）的采购单 ，
 * 董事长可以审批10万元至50万元（不包括50万元）的采购单，
 * 50万元及以上的采购单就需要开董事会讨论决定
 *
 * 为了让采购单的审批流程更加灵活，并实现采购单的链式传递和处理
 * 采购单审批实例中应用的是纯的职责链模式
 */
class Client {
  public static void main(String[] args) {
    Approver wjzhang, gyang, jguo, meeting;
    wjzhang = new Director("张无忌");
    gyang = new VicePresident("杨过");
    jguo = new President("郭靖");
    meeting = new Congress("董事会");

    //创建职责链
    wjzhang.setSuccessor(gyang);
    gyang.setSuccessor(jguo);
    jguo.setSuccessor(meeting);

    // 在客户端代码中，如果要将新的具体请求处理者应用在系统中，需要创建新的具体处理者对象，然后将该对象加入职责链中。
    // 如在客户端测试代码中增加如下代码：
    Approver rhuang;
    rhuang = new Manager("黄蓉");
    wjzhang.setSuccessor(rhuang); //将“黄蓉”作为“张无忌”的下家
    rhuang.setSuccessor(gyang); //将“杨过”作为“黄蓉”的下家

    //创建采购单
    PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买倚天剑");
    wjzhang.processRequest(pr1);

    PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "购买《葵花宝典》");
    wjzhang.processRequest(pr2);

    PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买《金刚经》");
    wjzhang.processRequest(pr3);

    PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "购买桃花岛");
    wjzhang.processRequest(pr4);
  }
}