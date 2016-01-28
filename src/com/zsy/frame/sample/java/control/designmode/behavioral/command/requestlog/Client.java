package com.zsy.frame.sample.java.control.designmode.behavioral.command.requestlog;

/**
 * 开发了一个网站配置文件管理工具，可以通过一个可视化界面对网站配置文件进行增删改等操作，该工具使用命令模式进行设计
 *
 * 请求日志文件可以实现很多功能，常用功能如下：
 * (1) “天有不测风云”，一旦系统发生故障，日志文件可以为系统提供一种恢复机制，在请求日志文件中可以记录用户对系统的每一步操作，从而让系统能够顺利恢复到某一个特定的状态；
 * (2) 请求日志也可以用于实现批处理，在一个请求日志文件中可以存储一系列命令对象，例如一个命令队列；
 * (3) 可以将命令队列中的所有命令对象都存储在一个日志文件中，每执行一个命令则从日志文件中删除一个对应的命令对象，
 * 防止因为断电或者系统重启等原因造成请求丢失，而且可以避免重新发送全部请求时造成某些命令的重复执行，只需读取请求日志文件，再继续执行文件中剩余的命令即可。
 * 在实现请求日志时，我们可以将命令对象通过序列化写到日志文件中，此时命令类必须实现java.io.Serializable接口。下面我们通过一个简单实例来说明日志文件的用途以及如何实现请求日志：
 */
class Client {
  public static void main(String args[]) {
    ConfigSettingWindow csw = new ConfigSettingWindow(); //定义请求发送者
    Command command; //定义命令对象
    ConfigOperator co = new ConfigOperator(); //定义请求接收者

    //四次对配置文件的更改
    //命令装载接收者，再把命令装载到发送者，建立一对一关系
    command = new InsertCommand("增加");
    command.setConfigOperator(co);
    csw.setCommand(command);
    csw.call("网站首页");

    command = new InsertCommand("增加");
    command.setConfigOperator(co);
    csw.setCommand(command);
    csw.call("端口号");

    command = new ModifyCommand("修改");
    command.setConfigOperator(co);
    csw.setCommand(command);
    csw.call("网站首页");

    command = new ModifyCommand("修改");
    command.setConfigOperator(co);
    csw.setCommand(command);
    csw.call("端口号");

    System.out.println("----------------------------");
    System.out.println("保存配置");
    csw.save();

    System.out.println("----------------------------");
    System.out.println("恢复配置");
    System.out.println("----------------------------");
    csw.recover();
  }
}