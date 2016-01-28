package com.zsy.frame.sample.java.control.designmode.behavioral.command.homeauto.base;

public interface Control {

  public void onButton(int slot);

  public void offButton(int slot);

  public void undoButton();
}
