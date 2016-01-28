package com.zsy.frame.sample.java.control.designmode.behavioral.observer.weather.advance;

public interface Subject {
  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  public void notifyObservers();
}
