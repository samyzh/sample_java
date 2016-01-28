package com.zsy.frame.sample.java.control.designmode.behavioral.interpreter.instructions;

import java.util.StringTokenizer;

//环境类：用于存储和操作需要解释的语句，在本实例中每一个需要解释的单词可以称为一个动作标记(Action Token)或命令

/**
 * 环境类Context用于存储解释器之外的一些全局信息，它通常作为参数被传递到所有表达式的解释方法interpret()中，
 * 可以在Context对象中存储和访问表达式解释器的状态，向表达式解释器提供一些全局的、公共的数据，
 * 此外还可以在Context中增加一些所有表达式解释器都共有的功能，减轻解释器的职责。
 */
class Context {
  private StringTokenizer tokenizer; //StringTokenizer类，用于将字符串分解为更小的字符串标记(Token)，默认情况下以空格作为分隔符
  private String currentToken; //当前字符串标记

  public Context(String text) {
    tokenizer = new StringTokenizer(text); //通过传入的指令字符串创建StringTokenizer对象
    nextToken();
  }

  //返回下一个标记
  public String nextToken() {
    if (tokenizer.hasMoreTokens()) {
      currentToken = tokenizer.nextToken();
    } else {
      currentToken = null;
    }
    return currentToken;
  }

  //返回当前的标记
  public String currentToken() {
    return currentToken;
  }

  //跳过一个标记
  public void skipToken(String token) {
    if (!token.equals(currentToken)) {
      System.err.println("错误提示：" + currentToken + "解释错误！");
    }
    nextToken();
  }

  //如果当前的标记是一个数字，则返回对应的数值
  public int currentNumber() {
    int number = 0;
    try {
      number = Integer.parseInt(currentToken); //将字符串转换为整数
    } catch (NumberFormatException e) {
      System.err.println("错误提示：" + e);
    }
    return number;
  }
}  