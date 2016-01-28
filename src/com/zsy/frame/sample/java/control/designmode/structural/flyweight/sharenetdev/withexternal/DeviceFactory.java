package com.zsy.frame.sample.java.control.designmode.structural.flyweight.sharenetdev.withexternal;

import java.util.*;

/**
 * 享元工厂类
 * 享元工厂类用于创建并管理享元对象，它针对抽象享元类编程，将各种类型的具体享元对象存储在一个享元池中
 *
 * 在享元模式的享元工厂类中通常提供一个静态的工厂方法用于返回享元对象，使用简单工厂模式来生成享元对象。
 */
public class DeviceFactory {

  private ArrayList devices = new ArrayList();
  private int totalTerminal = 0;

  /**
   * 也map的key,value键值对形式来处理
   */
  //    //定义一个HashMap用于存储享元对象，实现享元池
  //    private HashMap flyweights = new HashMap();
  //    public Flyweight getFlyweight(String key){
  //        //如果对象存在，则直接从享元池获取
  //        if(flyweights.containsKey(key)){
  //            return(Flyweight)flyweights.get(key);
  //        }
  //        //如果对象不存在，先创建一个新的对象添加到享元池中，然后返回
  //        else {
  //            Flyweight fw = new ConcreteFlyweight();
  //            flyweights.put(key,fw);
  //            return fw;
  //        }
  //    }
  public DeviceFactory() {
    NetworkDevice nd1 = new Switch("Cisco-WS-C2950-24");
    devices.add(nd1);
    NetworkDevice nd2 = new Hub("TP-LINK-HF8M");
    devices.add(nd2);
  }

  public NetworkDevice getNetworkDevice(String type) {
    if (type.equalsIgnoreCase("cisco")) {
      totalTerminal++;
      return (NetworkDevice) devices.get(0);
    } else if (type.equalsIgnoreCase("tp")) {
      totalTerminal++;
      return (NetworkDevice) devices.get(1);
    } else {
      return null;
    }
  }

  public int getTotalDevice() {
    return devices.size();
  }

  public int getTotalTerminal() {
    return totalTerminal;
  }
}