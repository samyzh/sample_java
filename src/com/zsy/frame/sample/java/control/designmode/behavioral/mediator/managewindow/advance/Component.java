package com.zsy.frame.sample.java.control.designmode.behavioral.mediator.managewindow.advance;

//抽象组件类：抽象同事类
abstract class Component {
  protected Mediator mediator;

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  //转发调用
  public void changed() {
    mediator.componentChanged(this);
  }

  public abstract void update();
}  