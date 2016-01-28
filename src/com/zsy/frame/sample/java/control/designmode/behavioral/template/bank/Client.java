package com.zsy.frame.sample.java.control.designmode.behavioral.template.bank;

/**
 * 在银行办理业务时，一般都包含几个基本步骤，首先需要取号排队，然后办理具体业务，最后需要对银行工作人员进行评分。
 * 无论具体业务是取款、存款还是转账，其基本流程都一样。现使用模板方法模式模拟银行业务办理流程。
 */
public class Client {
  public static void main(String a[]) {
    BankTemplateMethod bank;
    //		bank=(BankTemplateMethod)XMLUtil.getBean();
    bank = new Transfer();
    bank.process();
    System.out.println("---------------------------------------");
  }
}
