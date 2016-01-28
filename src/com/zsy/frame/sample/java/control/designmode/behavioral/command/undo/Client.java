package com.zsy.frame.sample.java.control.designmode.behavioral.command.undo;

/**
 * 需要注意的是在本实例中只能实现一步撤销操作，因为没有保存命令对象的历史状态，
 * 可以通过引入一个命令集合或其他方式来存储每一次操作时命令的状态，从而实现多次撤销操作。
 * 除了Undo操作外，还可以采用类似的方式实现恢复(Redo)操作，即恢复所撤销的操作（或称为二次撤销）。
 *
 * 修改简易计算器源代码，使之能够实现多次撤销(Undo)和恢复(Redo)。
 */
class Client {
  public static void main(String args[]) {

    // 将一个请求封装为一个对象，从而使我们可用不同的请求对客户进行参数化；
    ConcreteCommand command = new ConcreteCommand();
    // 命令封装
    CalculatorForm form = new CalculatorForm();
    form.setCommand(command);

    // 对请求排队或者记录请求日志，以及支持可撤销的操作
    form.compute(10);
    form.compute(5);
    form.compute(10);
    form.undo();
    form.undo();
  }
}