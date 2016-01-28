package com.zsy.frame.sample.java.control.designmode.structural.bridge.pen;

public class Client {
  public static void main(String a[]) {
    Color color;
    Pen pen;

    //		color=(Color)XMLUtilPen.getBean("color");
    //		pen=(Pen)XMLUtilPen.getBean("pen");
    color = new White();
    pen = new SmallPen();

    pen.setColor(color);
    pen.draw("鲜花");
  }
}