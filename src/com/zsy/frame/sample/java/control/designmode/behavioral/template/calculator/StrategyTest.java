package com.zsy.frame.sample.java.control.designmode.behavioral.template.calculator;

/**
 * @author samy
 * @description： 14、模板方法模式（Template Method）
 * 解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，定义一个类，
 * 继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用，先看个关系图：
 * Template Method模式是实现IOC的一种基本模式；（简称TM模式）
 * @date 2015-3-18 下午10:15:44
 */
public class StrategyTest {

  public static void main(String[] args) {
    String exp = "8+8";
    AbstractCalculator cal = new Plus();
    int result = cal.calculate(exp, "\\+");
    System.out.println(result); // 16
  }
}