package com.zsy.frame.sample.java.control.designmode.behavioral.command.tv;

/**
 * 电视机是请求的接收者，遥控器是请求的发送者，遥控器上有一些按钮，不同的按钮对应电视机的不同操作。(接受者和发送者关系一一对应)
 *
 * 抽象命令角色由一个命令接口来扮演，
 * 有三个具体的命令类实现了抽象命令接口，这三个具体命令类分别代表三种操作：打开电视机、关闭电视机和切换频道。
 */
public class Client {
  public static void main(String a[]) {
    AbstractCommand openCommand, closeCommand, changeCommand;
    //目前这种方式，定义命令对象new 命令接收对象 (也可以以注入的方式)

    //定义命令对象
    openCommand = new TVOpenCommand();
    closeCommand = new TVCloseCommand();
    changeCommand = new TVChangeCommand();

    //     定义请求发送者   命令封装
    Controller control = new Controller(openCommand, closeCommand, changeCommand);

    control.open();
    control.change();
    control.close();
  }
}