package com.zsy.frame.sample.java.control.designmode.behavioral.mediator.managewindow.bae;

//组合框类
class ComboBox {
  private List list;
  private TextBox tb;
  //    ......

  //界面组件的交互
  public void change() {
    list.update();
    tb.update();
  }

  public void update() {
    //        ......
  }
  //    ......
}  