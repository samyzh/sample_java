package com.zsy.frame.sample.java.control.designmode.behavioral.interpreter.calculator;

//AbstractExpression: 抽象表达式
public abstract class SymbolNode implements Node {
  protected Node left;
  protected Node right;

  public SymbolNode(Node left, Node right) {
    this.left = left;
    this.right = right;
  }
}