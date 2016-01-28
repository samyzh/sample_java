package com.zsy.frame.sample.java.control.designmode.behavioral.interpreter.calculator;

//● TerminalExpression（终结符表达式）：终结符表达式是抽象表达式的子类，它实现了与文法中的终结符相关联的解释操作，
// 在句子中的每一个终结符都是该类的一个实例。通常在一个解释器模式中只有少数几个终结符表达式类，
// 它们的实例可以通过非终结符表达式组成较为复杂的句子。
public class ValueNode implements Node {
  private int value;

  public ValueNode(int value) {
    this.value = value;
  }

  public int interpret() {
    return this.value;
  }
}