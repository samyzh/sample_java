package com.zsy.frame.sample.java.control.designmode.behavioral.memento.chess;

/**
 * 本实例只能实现最简单的Undo和Redo操作，并未考虑对象状态在操作过程中出现分支的情况。
 * 如果在撤销到某个历史状态之后，用户再修改对象状态，此后执行Undo操作时可能会发生对象状态错误，
 * 大家可以思考其产生原因。【注：可将对象状态的改变绘制成一张树状图进行分析。】
 *
 * 在实际开发中，可以使用链表或者堆栈来处理有分支的对象状态改变，大家可通过链表或者堆栈对上述实例进行改进。
 */
class ClientMultiple {
  private static int index = -1; //定义一个索引来记录当前状态所在位置
  //    private static MementoCaretaker mc = new MementoCaretaker();
  private static MementoCaretakerMultiple mc = new MementoCaretakerMultiple();

  public static void main(String args[]) {
    Chessman chess = new Chessman("车", 1, 1);
    play(chess);
    chess.setY(4);
    play(chess);
    chess.setX(5);
    play(chess);
    undo(chess, index);
    undo(chess, index);
    redo(chess, index);
    redo(chess, index);
  }

  //下棋
  public static void play(Chessman chess) {
    mc.setMemento(chess.save()); //保存备忘录
    index++;
    System.out.println(
        "棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
  }

  //悔棋
  public static void undo(Chessman chess, int i) {
    System.out.println("******悔棋******");
    index--;
    chess.restore(mc.getMemento(i - 1)); //撤销到上一个备忘录
    System.out.println(
        "棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
  }

  //撤销悔棋
  public static void redo(Chessman chess, int i) {
    System.out.println("******撤销悔棋******");
    index++;
    chess.restore(mc.getMemento(i + 1)); //恢复到下一个备忘录
    System.out.println(
        "棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
  }
}