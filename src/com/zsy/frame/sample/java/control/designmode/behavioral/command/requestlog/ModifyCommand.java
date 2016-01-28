package com.zsy.frame.sample.java.control.designmode.behavioral.command.requestlog;

//修改命令类：具体命令
//省略了删除命令类DeleteCommand
class ModifyCommand extends Command {
  public ModifyCommand(String name) {
    super(name);
  }

  public void execute(String args) {
    this.args = args;
    configOperator.modify(args);
  }

  public void execute() {
    configOperator.modify(this.args);
  }
}  