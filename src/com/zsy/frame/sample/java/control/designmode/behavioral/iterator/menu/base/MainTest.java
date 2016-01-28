package com.zsy.frame.sample.java.control.designmode.behavioral.iterator.menu.base;

/**
 * 两个菜馆合并后的菜单问题
 * 蛋糕店与餐厅合并后，怎么统一管理菜单项目
 * 问题：一个用ArrayList管理菜单，一个用数组管理
 * 传统设计
 *
 * 用迭代器接口改造菜单
 * 迭代器模式：提供一种方法顺序访问一个聚合对象中的各个对象
 */
public class MainTest {
  public static void main(String[] args) {

    Waitress mWaitress = new Waitress();

    mWaitress.printMenu();
  }
}
