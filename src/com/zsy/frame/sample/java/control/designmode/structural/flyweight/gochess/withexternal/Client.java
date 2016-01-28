package com.zsy.frame.sample.java.control.designmode.structural.flyweight.gochess.withexternal;

/**
 * 享元模式以共享的方式高效地支持大量的细粒度对象，享元对象能做到共享的关键是区分内部状态(Internal State)和外部状态(External State)
 * (1) 内部状态是存储在享元对象内部并且不会随环境改变而改变的状态，因此内部状态可以共享。
 * (2) 外部状态是随环境改变而改变的、不可以共享的状态。享元对象的外部状态必须由客户端保存，并在享元对象被创建之后，
 *     在需要使用的时候再传入到享元对象内部。一个外部状态与另一个外部状态之间是相互独立的
 *
 *
 * 带外部状态的解决方案
 * 软件公司开发人员通过对围棋棋子进行进一步分析，发现虽然黑色棋子和白色棋子可以共享，但是它们将显示在棋盘的不同位置，
 * 如何让相同的黑子或者白子能够多次重复显示且位于一个棋盘的不同地方？解决方法就是将棋子的位置定义为棋子的一个外部状态，
 * 在需要时再进行设置。因此，我们在图中增加了一个新的类Coordinates（坐标类），用于存储每一个棋子的位置
 *
 *
 * 从输出结果可以看到，在每次调用display()方法时，都设置了不同的外部状态——坐标值，因此相同的棋子对象虽然具有相同的颜色，
 * 但是它们的坐标值不同，将显示在棋盘的不同位置。
 */
class Client {
  public static void main(String args[]) {
    IgoChessman black1, black2, black3, white1, white2;
    com.zsy.frame.sample.java.control.designmode.structural.flyweight.gochess.withexternal.IgoChessmanFactory
        factory;

    //获取享元工厂对象
    factory =
        com.zsy.frame.sample.java.control.designmode.structural.flyweight.gochess.withexternal.IgoChessmanFactory
            .getInstance();

    //通过享元工厂获取三颗黑子
    black1 = factory.getIgoChessman("b");
    black2 = factory.getIgoChessman("b");
    black3 = factory.getIgoChessman("b");
    System.out.println("判断两颗黑子是否相同：" + (black1 == black2));

    //通过享元工厂获取两颗白子
    white1 = factory.getIgoChessman("w");
    white2 = factory.getIgoChessman("w");
    System.out.println("判断两颗白子是否相同：" + (white1 == white2));

    //显示棋子
    //            black1.display();
    //            black2.display();
    //            black3.display();
    //            white1.display();
    //            white2.display();
    //显示棋子，同时设置棋子的坐标位置
    black1.display(new Coordinates(1, 2));
    black2.display(new Coordinates(3, 4));
    black3.display(new Coordinates(1, 3));
    white1.display(new Coordinates(2, 5));
    white2.display(new Coordinates(2, 4));
  }
}