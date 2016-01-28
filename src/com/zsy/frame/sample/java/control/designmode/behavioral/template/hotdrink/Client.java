package com.zsy.frame.sample.java.control.designmode.behavioral.template.hotdrink;

/**
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-07 20:14
 */
public class Client {
  public static void main(String a[]) {
    //        HotDrinkTemplate teaWithHook = new TeaWithHook();
    HotDrinkTemplate teaWithHook = new Tea();
    teaWithHook.prepareRecipe();
  }
}
