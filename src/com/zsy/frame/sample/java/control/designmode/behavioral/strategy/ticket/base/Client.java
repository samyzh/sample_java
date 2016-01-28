package com.zsy.frame.sample.java.control.designmode.behavioral.strategy.ticket.base;

/**
 * 通过MovieTicket类实现了电影票的折后价计算，该方案解决了电影票打折问题，每一种打折方式都可以称为一种打折算法，
 * 更换打折方式只需修改客户端代码中的参数，无须修改已有源代码，但该方案并不是一个完美的解决方案，它至少存在如下三个问题：
 *
 * (1) MovieTicket类的calculate()方法非常庞大，它包含各种打折算法的实现代码，在代码中出现了较长的if…else…语句，不利于测试和维护。
 *
 * (2) 增加新的打折算法或者对原有打折算法进行修改时必须修改MovieTicket类的源代码，违反了“开闭原则”，系统的灵活性和可扩展性较差。
 *
 * (3) 算法的复用性差，如果在另一个系统（如商场销售管理系统）中需要重用某些打折算法，只能通过对源代码进行复制粘贴来重用，
 * 无法单独重用其中的某个或某些算法（重用较为麻烦）。
 *
 * 如何解决这三个问题？导致产生这些问题的主要原因在于MovieTicket类职责过重，它将各种打折算法都定义在一个类中，这既不便于算法的重用
 * ，也不便于算法的扩展。因此我们需要对MovieTicket类进行重构，将原本庞大的MovieTicket类的职责进行分解，将算法的定义和使用分离，
 * 这就是策略模式所要解决的问题，下面将进入策略模式的学习。
 */
class Client {
  public static void main(String args[]) {
    MovieTicket mt = new MovieTicket();
    double originalPrice = 60.0; //原始票价
    double currentPrice; //折后价

    mt.setPrice(originalPrice);
    System.out.println("原始价为：" + originalPrice);
    System.out.println("---------------------------------");

    mt.setType("student"); //学生票
    currentPrice = mt.getPrice();
    System.out.println("折后价为：" + currentPrice);
    System.out.println("---------------------------------");

    mt.setType("children"); //儿童票
    currentPrice = mt.getPrice();
    System.out.println("折后价为：" + currentPrice);
  }
}