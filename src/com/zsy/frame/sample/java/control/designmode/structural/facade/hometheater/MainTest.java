package com.zsy.frame.sample.java.control.designmode.structural.facade.hometheater;

public class MainTest {
  public static void main(String[] args) {
    HomeTheaterFacade mHomeTheaterFacade = new HomeTheaterFacade();

    mHomeTheaterFacade.ready();
    System.out.println("准备完毕==========");
    mHomeTheaterFacade.play();
    System.out.println("开始播放==========");
  }
}
