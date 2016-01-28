package com.zsy.frame.sample.java.control.designmode.behavioral.memento.base;

/**
 * 原发器可以创建一个备忘录，并存储它的当前内部状态，也可以使用备忘录来恢复其内部状态；
 */
public class Original {

  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Original(String value) {
    this.value = value;
  }

  public Memento createMemento() {
    return new Memento(value);
  }

  public void restoreMemento(Memento memento) {
    this.value = memento.getValue();
  }
}  