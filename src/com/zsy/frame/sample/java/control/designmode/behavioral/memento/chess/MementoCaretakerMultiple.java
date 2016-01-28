package com.zsy.frame.sample.java.control.designmode.behavioral.memento.chess;

import java.util.*;

/**
 * 提供一种多次撤销的解决方案，那就是在负责人类中定义一个集合来存储多个备忘录，每个备忘录负责保存一个历史状态，
 * 在撤销时可以对备忘录集合进行逆向遍历，回到一个指定的历史状态，而且还可以对备忘录集合进行正向遍历，实现重做(Redo)操作，即取消撤销，让对象状态得到恢复。
 */
class MementoCaretakerMultiple {
  //定义一个集合来存储多个备忘录
  private ArrayList mementolist = new ArrayList();

  public ChessmanMemento getMemento(int i) {
    return (ChessmanMemento) mementolist.get(i);
  }

  public void setMemento(ChessmanMemento memento) {
    mementolist.add(memento);
  }
}