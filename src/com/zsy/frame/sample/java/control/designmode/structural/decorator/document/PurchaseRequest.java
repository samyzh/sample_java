package com.zsy.frame.sample.java.control.designmode.structural.decorator.document;

/**
 * 采购单
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-05 17:41
 */
public class PurchaseRequest implements Document {
  public PurchaseRequest() {
  }

  @Override public void display() {
    System.out.print("====采购单");
  }
}
