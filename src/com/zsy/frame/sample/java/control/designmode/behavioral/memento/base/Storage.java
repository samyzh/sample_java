package com.zsy.frame.sample.java.control.designmode.behavioral.memento.base;

/**
 * 备忘录存储原发器的内部状态，根据原发器来决定保存哪些内部状态
 */
public class Storage {

  private Memento memento;

  public Storage(Memento memento) {
    this.memento = memento;
  }

  public Memento getMemento() {
    return memento;
  }

  public void setMemento(Memento memento) {
    this.memento = memento;
  }
}  