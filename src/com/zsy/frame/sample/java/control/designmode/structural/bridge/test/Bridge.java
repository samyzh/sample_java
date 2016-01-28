package com.zsy.frame.sample.java.control.designmode.structural.bridge.test;

/**
 * 就通过对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用
 *
 * 脱耦：脱耦就是将抽象化和实现化之间的耦合解脱开，
 * 或者说是将它们之间的强关联改换成弱关联，将两个角色之间的继承关系改为关联关系
 */
public abstract class Bridge {
  private Sourceable source;

  public void method() {
    source.method();
  }

  public Sourceable getSource() {
    return source;
  }

  public void setSource(Sourceable source) {
    this.source = source;
  }
}  