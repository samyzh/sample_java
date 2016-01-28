package com.zsy.frame.sample.java.control.designmode.behavioral.observer.loginview;

import java.util.EventListener;

//Abstract Observer
public interface LoginEventListener extends EventListener {
  public void validateLogin(LoginEvent event);
}