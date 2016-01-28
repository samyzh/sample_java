package com.zsy.frame.sample.java.control.designmode.structural.adapter.objectof.encrypt;

/**
 * 适配器类
 */
public class CipherAdapter extends DataOperation {
  private Caesar cipher;

  /**
   * 适配器类继承了目标抽象类并定义了一个适配者类的对象实例
   */
  public CipherAdapter() {
    cipher = new Caesar();
  }

  /**
   * 在所继承的目标抽象类方法中调用适配者类的相应业务方法。
   */
  public String doEncrypt(int key, String ps) {
    return cipher.doEncrypt(key, ps);
  }
}