package com.zsy.frame.sample.java.control.designmode.behavioral.memento.undouserinfo;

/**
 * 备忘录模式包含如下角色：
 * Originator: 原发器
 * Memento: 备忘录
 * Caretaker: 负责人
 */
public class Client {
  public static void main(String a[]) {
    // 创建原始类
    UserInfoDTO user = new UserInfoDTO();
    user.setAccount("zhangsan");
    user.setPassword("123456");
    user.setTelNo("13000000000");
    System.out.println("状态一：");
    user.show();
    // 创建备忘录
    Caretaker c = new Caretaker();
    c.setMemento(user.saveMemento());//保存备忘录
    System.out.println("---------------------------");

    // 修改原始类的状态
    user.setPassword("111111");
    user.setTelNo("13100001111");
    System.out.println("状态二：");
    user.show();
    System.out.println("---------------------------");

    // 回复原始类的状态
    user.restoreMemento(c.getMemento());//从备忘录中恢复
    System.out.println("回到状态一：");
    user.show();
    System.out.println("---------------------------");
  }
}