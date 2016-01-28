package com.zsy.frame.sample.java.control.designmode.structural.decorator.transformers;

/**
 * 半透明装饰模式（变形金刚）
 */
public class Client {
  public static void main(String args[]) {
    Transform camaro;
    camaro = new Car();
    camaro.move();
    //        在原来move的基础上添加功能
    System.out.println("-----------------------------");
    Airplane bumblebee = new Airplane(camaro);
    bumblebee.move();
    bumblebee.fly();

    //        在原来move的基础上添加功能
    System.out.println("-----------------------------");
    Robot robot = new Robot(camaro);
    robot.say();
    robot.move();
  }
}