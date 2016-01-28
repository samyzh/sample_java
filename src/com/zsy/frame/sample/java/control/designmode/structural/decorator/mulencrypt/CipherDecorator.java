package com.zsy.frame.sample.java.control.designmode.structural.decorator.mulencrypt;

/**
 * 装饰器
 */
public class CipherDecorator implements Cipher {
  private Cipher cipher;

  public CipherDecorator(Cipher cipher) {
    this.cipher = cipher;
  }

  public String encrypt(String plainText) {
    return cipher.encrypt(plainText);
  }
}
