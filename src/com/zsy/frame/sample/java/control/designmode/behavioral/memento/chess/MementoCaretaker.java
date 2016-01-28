package com.zsy.frame.sample.java.control.designmode.behavioral.memento.chess;

//象棋棋子备忘录管理类：负责人
class MementoCaretaker {
  private ChessmanMemento memento;

  public ChessmanMemento getMemento() {
    return memento;
  }

  public void setMemento(ChessmanMemento memento) {
    this.memento = memento;
  }
}  