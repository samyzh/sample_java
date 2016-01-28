package com.zsy.frame.sample.java.control.designmode.behavioral.interpreter.calculator;

/**
 * 解释器模式包含如下角色：
 AbstractExpression: 抽象表达式
 TerminalExpression: 终结符表达式
 NonterminalExpression: 非终结符表达式
 Context: 环境类
 Client: 客户类
 *
 * 现需要构造一个语言解释器，使得系统可以执行整数间的乘、除和求模运算。如用户输入表达式“3 * 4 / 2 % 4”，
 * 输出结果为2。使用解释器模式实现该功能。
 */
public class Client {
  public static void main(String args[]) {
    String statement = "3 * 2 * 4 / 6 % 5";

    Calculator calculator = new Calculator();
    calculator.build(statement);

    int result = calculator.compute();
    System.out.println(statement + " = " + result);
  }
}