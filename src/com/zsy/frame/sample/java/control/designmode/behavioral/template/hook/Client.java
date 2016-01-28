package com.zsy.frame.sample.java.control.designmode.behavioral.template.hook;

class Client {
  public static void main(String a[]) {
    HookDemo hd;
    hd = new SubHookDemo();
    hd.process();
  }
}