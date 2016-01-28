package com.zsy.frame.sample.java.control.designmode.structural.decorator.transformers;

public class Changer implements Transform {
  private Transform transform;

  public Changer(Transform transform) {
    this.transform = transform;
  }

  public void move() {
    transform.move();
  }
}