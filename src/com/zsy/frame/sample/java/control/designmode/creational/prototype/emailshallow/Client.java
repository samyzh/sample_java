package com.zsy.frame.sample.java.control.designmode.creational.prototype.emailshallow;

/**
 * 浅克隆
 * 将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
 * 深克隆
 * 将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底
 * 要实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象
 */
public class Client {
  public static void main(String a[]) {
    Email email, copyEmail;

    email = new Email();
    copyEmail = (Email) email.clone();
    copyEmail.display();
    System.out.println("email==copyEmail?");
    System.out.println(email == copyEmail);
    //浅拷贝，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的
    System.out.println("email.getAttachment==copyEmail.getAttachment?");
    System.out.println(email.getAttachment() == copyEmail.getAttachment());
  }
}