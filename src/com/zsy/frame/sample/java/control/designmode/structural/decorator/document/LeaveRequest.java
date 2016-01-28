package com.zsy.frame.sample.java.control.designmode.structural.decorator.document;

/**
 * 请假条
 *
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-05 17:41
 */
public class LeaveRequest implements Document {
  public LeaveRequest() {
  }

  @Override public void display() {
    System.out.print("====请假条");
  }
}
