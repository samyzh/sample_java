package com.zsy.frame.sample.java.control.designmode.structural.decorator.document;

/**
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-05 17:45
 */
//具体装饰类
public class Deleter extends Decorator {
  public Deleter(Document document) {
    super(document);
    System.out.println("增加删除功能！");
  }

  public void delete() {
    System.out.println("删除文件！");
  }
}
