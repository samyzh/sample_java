package com.zsy.frame.sample.java.control.designmode.structural.flyweight.gochess.withoutexternal;

/**
 * 虽然我们获取了三个黑子对象和两个白子对象，但是它们的内存地址相同，也就是说，它们实际上是同一个对象。
 * 在实现享元工厂类时我们使用了单例模式和简单工厂模式，确保了享元工厂对象的唯一性，并提供工厂方法来向客户端返回享元对象
 *
 * 带外部状态的解决方案
 *
 *软件公司开发人员通过对围棋棋子进行进一步分析，发现虽然黑色棋子和白色棋子可以共享，但是它们将显示在棋盘的不同位置，
 * 如何让相同的黑子或者白子能够多次重复显示且位于一个棋盘的不同地方？解决方法就是将棋子的位置定义为棋子的一个外部状态，
 * 在需要时再进行设置。因此，我们在图中增加了一个新的类Coordinates（坐标类），用于存储每一个棋子的位置
 */
class Client {
  public static void main(String args[]) {
    IgoChessman black1, black2, black3, white1, white2;
    IgoChessmanFactory factory;

    //获取享元工厂对象
    factory = IgoChessmanFactory.getInstance();

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
    black1.display();
    black2.display();
    black3.display();
    white1.display();
    white2.display();
  }
}