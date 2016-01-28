package com.zsy.frame.sample.java.control.designmode.behavioral.observer.weather.base;

/**
 * 1、Internet气象站项目：
 * 提供温度、气压和湿度的接口
 * 测量数据更新时需时时通知给第三方
 * 需要设计开放型API，便于其他第三方公司也能接入气象站获取数据
 *
 * 2、WeatherData类
 *
 * 3、有些问题
 * 1）其他第三方公司接入气象站获取数据的问题
 * 2）无法在运行时动态的添加第三方
 */
public class InternetWeather {

  public static void main(String[] args) {
    CurrentConditions mCurrentConditions;
    WeatherData mWeatherData;

    mCurrentConditions = new CurrentConditions();
    mWeatherData = new WeatherData(mCurrentConditions);

    mWeatherData.setData(30, 150, 40);
  }
}
