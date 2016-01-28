package com.zsy.frame.sample.java.control.designmode.structural.flyweight.sharenetdev.withoutexternal;

/**
 * 共享网络设备（无外部状态）
 很多网络设备都是支持共享的，如交换机、集线器等，多台终端计算机可以连接同一台网络设备，并通过该网络设备进行数据转发，如图所示，
 现用享元模式模拟共享网络设备的设计原理
 */
public class Client {
    public static void main(String args[]) {
        NetworkDevice nd1, nd2, nd3, nd4, nd5;
        DeviceFactory df = new DeviceFactory();

        nd1 = df.getNetworkDevice("cisco");
        nd1.use();

        nd2 = df.getNetworkDevice("cisco");
        nd2.use();

        nd3 = df.getNetworkDevice("cisco");
        nd3.use();

        nd4 = df.getNetworkDevice("tp");
        nd4.use();

        nd5 = df.getNetworkDevice("tp");
        nd5.use();

        System.out.println("Total Device:" + df.getTotalDevice());
        System.out.println("Total Terminal:" + df.getTotalTerminal());
    }
}