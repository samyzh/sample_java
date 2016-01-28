package com.zsy.frame.sample.java.control.designmode.behavioral.template.comparable;

import java.util.Arrays;

/**
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-07 20:54
 */
public class MainTest {
  public static void main(String[] args) {
    Duck[] ducks = {
        new Duck("Duck1", (int) (Math.random() * 100)),
        new Duck("Duck2", (int) (Math.random() * 100)),
        new Duck("Duck3", (int) (Math.random() * 100)),
        new Duck("Duck4", (int) (Math.random() * 100))
    };
    System.out.println("before sort:");
    dispay(ducks);
    Arrays.sort(ducks);
    System.out.println("after sort:");
    dispay(ducks);
  }

  private static void dispay(Duck[] ducks) {
    for (int i = 0; i < ducks.length - 1; i++) {
      System.out.println(ducks[i].toString());
    }
  }
}
