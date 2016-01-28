package com.zsy.frame.sample.java.control.designmode.behavioral.mediator.managewindow.bae;

//列表框类
class List {
  private ComboBox cb;
  private TextBox tb;
  //    ......

  //界面组件的交互
  public void change() {
    cb.update();
    tb.update();
  }

  public void update() {
    //        ......
  }
  //    ......
}  