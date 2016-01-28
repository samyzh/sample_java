package com.zsy.frame.sample.java.control.designmode.structural.adapter.objectof.encrypt;

/**
 * adapter has a adapter class
 */
public class NewCipherAdapter extends DataOperation {
  private NewCipher cipher;

  public NewCipherAdapter() {
    cipher = new NewCipher();
  }

  public String doEncrypt(int key, String ps) {
    return cipher.doEncrypt(key, ps);
  }
}


