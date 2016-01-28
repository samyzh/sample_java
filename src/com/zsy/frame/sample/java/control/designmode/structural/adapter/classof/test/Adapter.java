package com.zsy.frame.sample.java.control.designmode.structural.adapter.classof.test;

public class Adapter extends Source implements Targetable {
  @Override public void method2() {
    System.out.println("this is the targetable method!");
  }
} 