package com.zsy.frame.sample.java.control.designmode.creational.prototype.prototypemanager.officialdoc;

//软件需求规格说明书(Software Requirements Specification)类

class SRS implements OfficialDocument {

  public OfficialDocument clone() {

    OfficialDocument srs = null;

    try {

      srs = (OfficialDocument) super.clone();
    } catch (CloneNotSupportedException e) {

      System.out.println("不支持复制！");
    }

    return srs;
  }

  public void display() {
    System.out.println("《软件需求规格说明书》");
  }
}

 