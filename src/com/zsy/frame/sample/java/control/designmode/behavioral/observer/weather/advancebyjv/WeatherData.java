package com.zsy.frame.sample.java.control.designmode.behavioral.observer.weather.advancebyjv;

import java.util.Observable;

/**
 * 1、Java内置的观察者
 * Observable
 * Observer
 * 2、用Java内置观察者重新设计该项目
 * 3、内置观察者的注意点
 * Observable是类而不是接口,有点缺陷，不可以多继承，如是自己定义的接口就可以实现多个；接收多个事务就不好处理
 */
public class WeatherData extends Observable {
  private float mTemperatrue;
  private float mPressure;
  private float mHumidity;

  public float getTemperature() {
    return mTemperatrue;
  }

  public float getPressure() {
    return mPressure;
  }

  public float getHumidity() {
    return mHumidity;
  }

  public void dataChange() {
    //        注意这里用系统的一定得记住这个得先this.setChanged();后this.notifyObservers();
    this.setChanged();
    //        推模式
    //        this.notifyObservers();
    //        拉模式,携带数据的 ，不用遍历处理显示
    this.notifyObservers(new Data(getTemperature(), getPressure(), getHumidity()));
  }

  public void setData(float mTemperatrue, float mPressure, float mHumidity) {
    this.mTemperatrue = mTemperatrue;
    this.mPressure = mPressure;
    this.mHumidity = mHumidity;
    dataChange();
  }

  public class Data {
    public float mTemperatrue;
    public float mPressure;
    public float mHumidity;

    public Data(float mTemperatrue, float mPressure, float mHumidity) {
      this.mTemperatrue = mTemperatrue;
      this.mPressure = mPressure;
      this.mHumidity = mHumidity;
    }
  }
}
