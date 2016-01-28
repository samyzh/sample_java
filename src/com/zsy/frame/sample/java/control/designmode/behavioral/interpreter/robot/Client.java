package com.zsy.frame.sample.java.control.designmode.behavioral.interpreter.robot;

/**
 * 本实例对机器人控制指令的输出结果进行模拟，将英文指令翻译为中文指令，实际情况是调用不同的控制程序进行机器人的控制，
 * 包括对移动方向、方式和距离的控制等
 * <p>
 * 针对五条文法规则，分别提供五个类来实现，其中终结符表达式direction、action和distance对应DirectionNode类、
 * ActionNode类和DistanceNode类，非终结符表达式expression和composite对应SentenceNode类和AndNode类。
 *
 * AbstractNode充当抽象表达式角色，DirectionNode、ActionNode和DistanceNode充当终结符表达式角色，
 * AndNode和SentenceNode充当非终结符表达式角色
 */
class Client {
  public static void main(String args[]) {
    String instruction = "up move 5 and down run 10 and left move 5";
    InstructionHandler handler = new InstructionHandler();
    handler.handle(instruction);

    String outString;
    outString = handler.output();
    System.out.println(outString);
  }
}