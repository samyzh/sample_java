package com.zsy.frame.sample.java.control.designmode.behavioral.command.base;

/**
 * Invoker是调用者（司令员），Receiver是被调用者（士兵），MyCommand是命令，实现了Command接口，持有接收对象，
 * 熟悉Struts的同学应该知道，Struts其实就是一种将请求和呈现分离的技术，其中必然涉及命令模式的思想！
 * 其实每个设计模式都是很重要的一种思想，看上去很熟，其实是因为我们在学到的东西中都有涉及，尽管有时我们并不知道，
 * 其实在Java本身的设计之中处处都有体现，像AWT、JDBC、集合类、IO管道或者是Web框架，里面设计模式无处不在
 */
public class Test {

  public static void main(String[] args) {
    //  Receiver是被调用者（士兵），MyCommand是命令
    //      可有多个接收者,其实这里不应该暴露接收者
    Receiver receiver = new Receiver();
    Command cmd = new MyCommand(receiver);

    //Invoker是调用者（司令员）
    Invoker invoker = new Invoker(cmd);
    invoker.action();
  }
}  