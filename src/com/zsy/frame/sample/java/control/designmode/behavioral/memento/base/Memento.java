package com.zsy.frame.sample.java.control.designmode.behavioral.memento.base;

public class Memento {

  private String value;

  public Memento(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}  