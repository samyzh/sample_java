package com.zsy.frame.sample.java.control.designmode.structural.adapter.classof.biorobot;

public class BirdAdapter extends Bird implements Robot {
  public void cry() {
    System.out.print("机器人模仿：");
    super.tweedle();
  }

  public void move() {
    System.out.print("机器人模仿：");
    super.fly();
  }
}