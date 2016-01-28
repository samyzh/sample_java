package com.zsy.frame.sample.java.control.designmode.behavioral.command.homeauto.base;

/**
 * 家电自动化遥控器API项目：
 * 各家电API
 * 遥控器接口
 *
 * 要求自动化遥控器：扩展性好、维护性好
 *
 * 传统设计方案
 * 有哪些不足？耦合度高
 */
public class ControlTest {
  public static void main(String[] args) {
    Control ctl;
    Light light = new Light("Bedroom");
    Stereo stereo = new Stereo();
    ctl = new TraditionControl(light, stereo);

    ctl.onButton(0);
    ctl.offButton(0);
    ctl.onButton(1);
    ctl.onButton(2);
    ctl.offButton(2);

    ctl.offButton(1);
  }
}
