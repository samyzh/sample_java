package com.zsy.frame.sample.java.control.designmode.behavioral.mediator.virtualchat;

import java.util.*;
//ConcreteMediator: 具体中介者

/**
 * 中介者模式的核心在于中介者类的引入，在中介者模式中，中介者类承担了两方面的职责：
 * <p>
 * (1) 中转作用（结构性）：通过中介者提供的中转作用，各个同事对象就不再需要显式引用其他同事，当需要和其他同事进行通信时，
 * 可通过中介者来实现间接调用。该中转作用属于中介者在结构上的支持。
 * <p>
 * (2) 协调作用（行为性）：中介者可以更进一步的对同事之间的关系进行封装，同事可以一致的和中介者进行交互，
 * 而不需要指明中介者需要具体怎么做，中介者根据封装在自身内部的协调逻辑，对同事的请求进行进一步处理，
 * 将同事成员之间的关系行为进行分离和封装。该协调作用属于中介者在行为上的支持。
 */
public class ChatGroup extends AbstractChatroom {
  private Hashtable members = new Hashtable();

  public void register(Member member) {
    if (!members.contains(member)) {
      members.put(member.getName(), member);
      member.setChatroom(this);
    }
  }

  public void sendText(String from, String to, String message) {
    Member member = (Member) members.get(to);
    String newMessage = message;
    newMessage = message.replaceAll("日", "*");
    member.receiveText(from, newMessage);
  }

  public void sendImage(String from, String to, String image) {
    Member member = (Member) members.get(to);
    //模拟图片大小判断
    if (image.length() > 5) {
      System.out.println("图片太大，发送失败！");
    } else {
      member.receiveImage(from, image);
    }
  }
}