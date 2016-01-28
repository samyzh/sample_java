package com.zsy.frame.sample.java.control.designmode.behavioral.memento.chess;

/**
 * Chessman充当原发器，ChessmanMemento充当备忘录，MementoCaretaker充当负责人，
 * 在MementoCaretaker中定义了一个ChessmanMemento类型的对象，用于存储备忘录
 *
 * 此时的创建备忘录 在原发器里面定义实现
 */
class Client {
  public static void main(String args[]) {

    MementoCaretaker mc = new MementoCaretaker();
    //MementoCaretakerMultiple mc2 = new MementoCaretakerMultiple();
    // 创建原始类
    Chessman chess = new Chessman("车", 1, 1);
    display(chess);
    mc.setMemento(chess.save()); //保存状态
    chess.setY(4);
    display(chess);
    mc.setMemento(chess.save()); //保存状态
    display(chess);
    chess.setX(5);
    display(chess);
    System.out.println("******悔棋******");
    chess.restore(mc.getMemento()); //恢复状态
    display(chess);
  }

  public static void display(Chessman chess) {
    System.out.println(
        "棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
  }
}