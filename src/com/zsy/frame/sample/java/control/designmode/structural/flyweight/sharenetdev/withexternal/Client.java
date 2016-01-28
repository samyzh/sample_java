package com.zsy.frame.sample.java.control.designmode.structural.flyweight.sharenetdev.withexternal;

/**
 * 共享网络设备（有外部状态）
 * 虽然网络设备可以共享，但是分配给每一个终端计算机的端口(Port)是不同的，因此多台计算机虽然可以共享同一个网络设备，
 * 但必须使用不同的端口。我们可以将端口从网络设备中抽取出来作为外部状态，需要时再进行设置。
 */
public class Client {
  public static void main(String args[]) {
    NetworkDevice nd1, nd2, nd3, nd4, nd5;
    DeviceFactory df = new DeviceFactory();

    //        享元模式主要优点在于它可以极大减少内存中对象的数量，使得相同对象或相似对象在内存中只保存一份；
    // 其缺点是使得系统更加复杂，并且需要将享元对象的状态外部化，而读取外部状态使得运行时间变长
    nd1 = df.getNetworkDevice("cisco");
    //        两个独立的外部状态，它们可以独立变化，相互之间没有影响，客户端可以在使用时将外部状态注入享元对象中。
    nd1.use(new Port("1000"));

    nd2 = df.getNetworkDevice("cisco");
    nd2.use(new Port("1001"));

    nd3 = df.getNetworkDevice("cisco");
    nd3.use(new Port("1002"));

    nd4 = df.getNetworkDevice("tp");
    nd4.use(new Port("1003"));

    nd5 = df.getNetworkDevice("tp");
    nd5.use(new Port("1004"));

    System.out.println("Total Device:" + df.getTotalDevice());
    System.out.println("Total Terminal:" + df.getTotalTerminal());
  }
}