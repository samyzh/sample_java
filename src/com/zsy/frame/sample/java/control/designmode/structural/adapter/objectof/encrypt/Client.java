package com.zsy.frame.sample.java.control.designmode.structural.adapter.objectof.encrypt;

/**
 * 通过对象适配器实现；对象适配器演示
 * 某系统需要提供一个加密模块，将用户信息（如密码等机密信息）加密之后再存储在数据库中，
 * 系统已经定义好了数据库操作类。为了提高开发效率，现需要重用已有的加密算法，
 * 这些算法封装在一些由第三方提供的类中，有些甚至没有源代码。使用适配器模式设计该加密模块，
 * 实现在不修改现有类的基础上重用第三方加密方法。
 *
 * 对象的适配器模式：当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，
 * 持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。
 */
public class Client {
  public static void main(String args[]) {
    //		DataOperation dao=(DataOperation)XMLUtil.getBean();
    //		DataOperation dao= new NewCipherAdapter();
    DataOperation dao = new CipherAdapter();
    dao.setPassword("samyzhang");
    String ps = dao.getPassword();
    String es = dao.doEncrypt(6, ps);
    System.out.println("明文为：" + ps);
    System.out.println("密文为：" + es);
  }
}


