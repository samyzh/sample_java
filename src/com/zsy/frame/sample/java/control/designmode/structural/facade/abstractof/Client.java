package com.zsy.frame.sample.java.control.designmode.structural.facade.abstractof;

/**
 * 抽象装饰器，使其不违背“开闭原则”
 *
 * 外观模式最大的缺点在于违背了“开闭原则”，
 * 当增加新的子系统或者移除子系统时需要修改外观类，可以通过引入抽象外观类在一定程度上解决该问题，客户端针对抽象外观类进行编程
 * 对于新的业务需求，不修改原有外观类，而对应增加一个新的具体外观类，由新的具体外观类来关联新的子系统对象，
 * 同时通过修改配置文件来达到不修改源代码并更换外观类的目的
 *
 * 一个系统有多个外观类
 * 在外观模式中，通常只需要一个外观类，并且此外观类只有一个实例，换言之它是一个单例类。在很多情况下为了节约系统资源，一般将外观类设计为单例类
 * 当然这并不意味着在整个系统里只能有一个外观类，在一个系统中可以设计多个外观类，每个外观类都负责和一些特定的子系统交互，向用户提供相应的业务功能。
 *
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-06 11:48
 */
public class Client {
  public static void main(String args[]) {
    ConcreteFacade2 gsf = new ConcreteFacade2();
    gsf.method1();
    System.out.println("-----------------------");
    gsf.methodFacade2();
  }
}
