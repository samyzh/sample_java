package com.zsy.frame.sample.java.control.designmode.creational.prototype.prototypemanager.officialdoc;//可行性分析报告(Feasibility Analysis Report)类

//可行性分析报告(Feasibility Analysis Report)类
class FAR implements OfficialDocument {

  public OfficialDocument clone()

  {

    OfficialDocument far = null;

    try

    {

      far = (OfficialDocument) super.clone();
    } catch (CloneNotSupportedException e)

    {

      System.out.println("不支持复制！");
    }

    return far;
  }

  public void display()

  {

    System.out.println("《可行性分析报告》");
  }
}