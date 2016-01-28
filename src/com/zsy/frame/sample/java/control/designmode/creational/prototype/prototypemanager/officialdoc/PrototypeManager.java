package com.zsy.frame.sample.java.control.designmode.creational.prototype.prototypemanager.officialdoc;

//原型管理器（使用饿汉式单例实现）

import java.util.Hashtable;

class PrototypeManager {

  //定义一个Hashtable，用于存储原型对象

  private Hashtable ht = new Hashtable();

  private static PrototypeManager pm = new PrototypeManager();

  //为Hashtable增加公文对象
  private PrototypeManager() {
    ht.put("far", new FAR());
    ht.put("srs", new SRS());
  }

  //增加新的公文对象
  public void addOfficialDocument(String key, OfficialDocument doc) {

    ht.put(key, doc);
  }

  //通过浅克隆获取新的公文对象
  public OfficialDocument getOfficialDocument(String key) {
    return ((OfficialDocument) ht.get(key)).clone();
  }

  public static PrototypeManager getPrototypeManager() {
    return pm;
  }
}