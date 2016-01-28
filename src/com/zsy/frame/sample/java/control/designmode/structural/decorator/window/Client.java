package com.zsy.frame.sample.java.control.designmode.structural.decorator.window;

/**
 * 全透明装修模式
 */
class Client {
  public static void main(String args[]) {
    //        Component component, componentSB;  //使用抽象构件定义
    //        component = new Window(); //定义具体构件
    //        componentSB = new ScrollBarDecorator(component); //定义装饰后的构件
    //        componentSB.display();

    //装饰了一次之后的componentSB对象注入另一个装饰类BlackBorderDecorator中实现第二次装饰，得到一个经过两次装饰的对象componentBB，
    // 再调用componentBB的display()方法即可得到一个既有滚动条又有黑色边框的窗体。
    Component component, componentSB, componentBB; //全部使用抽象构件定义
    component = new Window();
    componentSB = new ScrollBarDecorator(component);
    componentBB = new BlackBorderDecorator(componentSB); //将装饰了一次之后的对象继续注入到另一个装饰类中，进行第二次装饰
    componentBB.display();
  }
}