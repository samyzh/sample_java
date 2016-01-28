package com.zsy.frame.sample.java.control.designmode.behavioral.state.screen;

/**
 * 切换状态的状态模式
 大多数的状态模式都是可以切换状态的状态模式，在实现状态切换时，
 在具体状态类内部需要调用环境类Context的setState()方法进行状态的转换操作，在具体状态类中可以调用到环境类的方法，
 因此状态类与环境类之间通常还存在关联关系或者依赖关系
 通过在状态类中引用环境类的对象来回调环境类的setState()方法实现状态的切换。
 在这种可以切换状态的状态模式中，增加新的状态类可能需要修改其他某些状态类甚至环境类的源代码，否则系统无法切换到新增状态。
 *
 *
 * 其具体功能描述如下：
 *
 * 用户单击“放大镜”按钮之后屏幕将放大一倍，再点击一次“放大镜”按钮屏幕再放大一倍，第三次点击该按钮后屏幕将还原到默认大小。
 *
 * 在上述代码中，所有的状态转换操作都由环境类Screen来实现，此时，环境类充当了状态管理器角色。如果需要增加新的状态，
 * 例如“八倍状态类”，需要修改环境类，这在一定程度上违背了“开闭原则”，但对其他状态类没有任何影响
 */
class Client {
  public static void main(String args[]) {
    Screen screen = new Screen();
    screen.onClick();
    screen.onClick();
    screen.onClick();
  }
}