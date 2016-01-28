package com.zsy.frame.sample.java.control.designmode.behavioral.interpreter.calculator;

import java.util.*;

//Context: 环境类
// Context（环境类）：环境类又称为上下文类，它用于存储解释器之外的一些全局信息，通常它临时存储了需要解释的语句。
//通常在解释器模式中还提供了一个环境类Context，用于存储一些全局信息，通常在Context中包含了一个HashMap或ArrayList
// 等类型的集合对象（也可以直接由HashMap等集合类充当环境类），存储一系列公共信息，
// 如变量名与值的映射关系（key/value）等，用于在进行具体的解释操作时从中获取相关信息
//指令处理类：工具类 ,这个还不是环境类
public class Calculator {
  private String statement;
  private Node node;

  public void build(String statement) {
    Node left = null, right = null;
    Stack stack = new Stack();

    String[] statementArr = statement.split(" ");

    for (int i = 0; i < statementArr.length; i++) {
      if (statementArr[i].equalsIgnoreCase("*")) {
        left = (Node) stack.pop();
        int val = Integer.parseInt(statementArr[++i]);
        right = new ValueNode(val);
        stack.push(new MulNode(left, right));
      } else if (statementArr[i].equalsIgnoreCase("/")) {
        left = (Node) stack.pop();
        int val = Integer.parseInt(statementArr[++i]);
        right = new ValueNode(val);
        stack.push(new DivNode(left, right));
      } else if (statementArr[i].equalsIgnoreCase("%")) {
        left = (Node) stack.pop();
        int val = Integer.parseInt(statementArr[++i]);
        right = new ValueNode(val);
        stack.push(new ModNode(left, right));
      } else {
        stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
      }
    }
    this.node = (Node) stack.pop();
  }

  public int compute() {
    return node.interpret();
  }
}