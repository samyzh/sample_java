package com.zsy.frame.sample.java.control.designmode.structural.bridge.test;

/**
 * 实现化：针对抽象化给出的具体实现，就是实现化，抽象化与实现化是一对互逆的概念，
 * 实现化产生的对象比抽象化更具体，是对抽象化事物的进一步具体化的产物。
 */
public class SourceSub1 implements Sourceable {
  @Override public void method() {
    System.out.println("this is the first sub!");
  }
}  