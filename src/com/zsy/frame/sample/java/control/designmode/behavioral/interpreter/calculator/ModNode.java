package com.zsy.frame.sample.java.control.designmode.behavioral.interpreter.calculator;

public class ModNode extends SymbolNode {
  public ModNode(Node left, Node right) {
    super(left, right);
  }

  public int interpret() {
    return super.left.interpret() % super.right.interpret();
  }
}