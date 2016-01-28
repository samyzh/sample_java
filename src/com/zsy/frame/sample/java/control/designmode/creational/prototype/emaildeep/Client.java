package com.zsy.frame.sample.java.control.designmode.creational.prototype.emaildeep;

public class Client {
  public static void main(String a[]) {
    Email email, copyEmail = null;

    email = new Email();
    try {
      copyEmail = (Email) email.deepClone();
    } catch (Exception e) {
      e.printStackTrace();
    }

    //深拷贝:不论是基本数据类型还有引用类型，都是重新创建的
    System.out.println("email==copyEmail?");
    System.out.println(email == copyEmail);

    System.out.println("email.getAttachment==copyEmail.getAttachment?");
    System.out.println(email.getAttachment() == copyEmail.getAttachment());
  }
}