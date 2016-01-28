package com.zsy.frame.sample.java.control.designmode.structural.decorator.myio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 编写IO自己的装饰器
 * 角色分配：
 抽象构件类：InputStream
 具体构件类：FileInputStream、ByteArrayInputStream等
 抽象装饰类：FilterInputStream
 具体装饰类：BufferedInputStream、DataInputStream等
 */
public class InputTest {
  public static void main(String[] args) {
    int c;
    try {
      InputStream in = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream(
          "D:\\samy\\android\\syframe\\syframeforjava\\SYFrameForJava\\src\\com\\zsy\\frame\\sample\\java\\control\\designmode\\structural\\decorator\\myio\\test.txt")));
      while ((c = in.read()) >= 0) {
        System.out.print((char) c);
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
