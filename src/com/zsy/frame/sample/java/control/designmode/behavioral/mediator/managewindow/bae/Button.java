package com.zsy.frame.sample.java.control.designmode.behavioral.mediator.managewindow.bae;

//按钮类
class Button {
  private List list;
  private ComboBox cb;
  private TextBox tb;
  //    ......

  //界面组件的交互
  public void change() {
    list.update();
    cb.update();
    tb.update();
  }

  public void update() {
    //        ......
  }
  //    ......
}  