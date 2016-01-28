package com.zsy.frame.sample.java.control.designmode.structural.decorator.document;

//抽象装饰类
class Decorator implements Document {
  private Document document;

  public Decorator(Document document) {
    this.document = document;
  }

  public void display() {
    document.display();
  }
}