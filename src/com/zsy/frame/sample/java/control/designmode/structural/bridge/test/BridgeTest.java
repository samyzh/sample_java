package com.zsy.frame.sample.java.control.designmode.structural.bridge.test;

/**
 * 适配器模式与桥接模式的联用
 * 桥接模式和适配器模式用于设计的不同阶段，桥接模式用于系统的初步设计，对于存在两个独立变化维度的类可以将其分为抽象化和实现化两个角色，使它们可以分别进行变化；
 * 而在初步设计完成之后，当发现系统与已有类无法协同工作时，可以采用适配器模式。但有时候在设计初期也需要考虑适配器模式，特别是那些涉及到大量第三方应用接口的情况。
 */
public class BridgeTest {

  public static void main(String[] args) {
    Bridge bridge = new MyBridge();
    /*调用第一个对象*/
    Sourceable source1 = new SourceSub1();
    bridge.setSource(source1);
    bridge.method();
    /*调用第二个对象*/
    Sourceable source2 = new SourceSub2();
    bridge.setSource(source2);
    bridge.method();
  }
} 