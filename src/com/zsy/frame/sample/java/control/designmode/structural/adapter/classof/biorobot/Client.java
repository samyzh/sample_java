package com.zsy.frame.sample.java.control.designmode.structural.adapter.classof.biorobot;

/**
 * 通过类适配器实现;类适配器演示
 *
 * 现需要设计一个可以模拟各种动物行为的机器人，在机器人中定义了一系列方法，如机器人叫喊方法cry()、机器人移动方法move()等。
 * 如果希望在不修改已有代码的基础上使得机器人能够像鸟一样叫，像狗一样跑，使用适配器模式进行系统设计。
 *
 * 当客户类调用适配器的方法时，在适配器类的内部将调用适配者类的方法，而这个过程对客户类是透明的，客户类并不直接访问适配者类
 * 在类适配器模式中，适配器类实现了目标抽象类接口并继承了适配者类，并在目标抽象类的实现方法中调用所继承的适配者类的方法；
 * 类的适配器模式：当希望将一个类转换成满足另一个新接口的类时，
 * 可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
 */
public class Client
{
    public static void main(String args[])
	{
//		Robot robot=(Robot)XMLUtil.getBean();
//		Robot robot= new BirdAdapter();
		Robot robot= new DogAdapter();
		robot.cry();
		robot.move();
	}
}