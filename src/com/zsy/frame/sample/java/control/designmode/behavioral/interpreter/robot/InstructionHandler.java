package com.zsy.frame.sample.java.control.designmode.behavioral.interpreter.robot;

import java.util.Stack;

/**
 * 环境类Context用于存储解释器之外的一些全局信息，它通常作为参数被传递到所有表达式的解释方法interpret()中，
 * 可以在Context对象中存储和访问表达式解释器的状态，向表达式解释器提供一些全局的、公共的数据，
 * 此外还可以在Context中增加一些所有表达式解释器都共有的功能，减轻解释器的职责。
 *
 * 在上面的机器人控制程序实例中，我们省略了环境类角色
 */
//指令处理类：工具类 ,这个还不是环境类
class InstructionHandler {
  private String instruction;
  private AbstractNode node;

  public void handle(String instruction) {
    AbstractNode left = null, right = null;
    AbstractNode direction = null, action = null, distance = null;
    Stack stack = new Stack(); //声明一个栈对象用于存储抽象语法树
    String[] words = instruction.split(" "); //以空格分隔指令字符串
    for (int i = 0; i < words.length; i++) {
      //本实例采用栈的方式来处理指令，如果遇到“and”，则将其后的三个单词作为三个终结符表达式连成一个
      // 简单句子SentenceNode作为“and”的右表达式，而将从栈顶弹出的表达式作为“and”的左表达式，最后将新的“and”表达式压入栈中。
      if (words[i].equalsIgnoreCase("and")) {
        left = (AbstractNode) stack.pop(); //弹出栈顶表达式作为左表达式
        String word1 = words[++i];
        direction = new DirectionNode(word1);
        String word2 = words[++i];
        action = new ActionNode(word2);
        String word3 = words[++i];
        distance = new DistanceNode(word3);
        right = new SentenceNode(direction, action, distance); //右表达式
        stack.push(new AndNode(left, right)); //将新表达式压入栈中
      } else {  //如果是从头开始进行解释，则将前三个单词组成一个简单句子SentenceNode并将该句子压入栈中
        String word1 = words[i];
        direction = new DirectionNode(word1);
        String word2 = words[++i];
        action = new ActionNode(word2);
        String word3 = words[++i];
        distance = new DistanceNode(word3);
        left = new SentenceNode(direction, action, distance);
        stack.push(left); //将新表达式压入栈中
      }
    }
    this.node = (AbstractNode) stack.pop(); //将全部表达式从栈中弹出
  }

  public String output() {
    String result = node.interpret(); //解释表达式
    return result;
  }
}  