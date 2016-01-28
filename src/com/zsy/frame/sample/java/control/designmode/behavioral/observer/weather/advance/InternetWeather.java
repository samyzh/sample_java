package com.zsy.frame.sample.java.control.designmode.behavioral.observer.weather.advance;

public class InternetWeather {

  public static void main(String[] args) {
    WeatherDataSt mWeatherDataSt;
    mWeatherDataSt = new WeatherDataSt();

    CurrentConditions mCurrentConditions;
    ForcastConditions mForcastConditions;

    mCurrentConditions = new CurrentConditions();
    mForcastConditions = new ForcastConditions();

    mWeatherDataSt.registerObserver(mCurrentConditions);
    mWeatherDataSt.registerObserver(mForcastConditions);
    //		注意这里没有先后顺序
    mWeatherDataSt.setData(30, 150, 40);
    System.out.println("移除当前温度通知后================");
    mWeatherDataSt.removeObserver(mCurrentConditions);
    mWeatherDataSt.setData(40, 250, 50);
  }
}
