package com.zsy.frame.sample.java.control.designmode.creational.prototype.prototypemanager.officialdoc;

/**
 * 在日常办公中有许多公文需要创建、递交和审批，例如《可行性分析报告》、《立项建议书》、
 * 《软件需求规格说明书》、《项目进展报告》等，为了提高工作效率，
 * 在OA系统中为各类公文均创建了模板，用户可以通过这些模板快速创建新的公文，这些公文模板需要统一进行管理，
 * 系统根据用户请求的不同生成不同的新公文。
 *   我们使用带原型管理器的原型模式实现公文管理器的设计
 */
class Client {

  public static void main(String args[]) {

    //获取原型管理器对象
    PrototypeManager pm = PrototypeManager.getPrototypeManager();

    OfficialDocument doc1, doc2, doc3, doc4;

    doc1 = pm.getOfficialDocument("far");
    doc1.display();

    doc2 = pm.getOfficialDocument("far");
    doc2.display();
    System.out.println(doc1 == doc2);

    doc3 = pm.getOfficialDocument("srs");
    doc3.display();

    doc4 = pm.getOfficialDocument("srs");
    doc4.display();

    System.out.println(doc3 == doc4);
  }
}