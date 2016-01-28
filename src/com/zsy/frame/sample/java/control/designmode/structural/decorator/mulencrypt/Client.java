package com.zsy.frame.sample.java.control.designmode.structural.decorator.mulencrypt;

/**
 * 透明装饰模式（多重加密系统）
 *
 * 某系统提供了一个数据加密功能，可以对字符串进行加密。最简单的加密算法通过对字母进行移位来实现，同时还提供了稍复杂的逆向输出加密，
 * 还提供了更为高级的求模加密。用户先使用最简单的加密算法对字符串进行加密，
 * 如果觉得还不够可以对加密之后的结果使用其他加密算法进行二次加密，当然也可以进行第三次加密。现使用装饰模式设计该多重加密系统。
 */
public class Client {
  public static void main(String args[]) {
    String password = "samyzhang";  //明文
    String cpassword;       //密文
    Cipher sc, ac, cc;

    sc = new SimpleCipher();
    cpassword = sc.encrypt(password);
    System.out.println(cpassword);
    System.out.println("---------------------");

    cc = new ComplexCipher(sc);
    cpassword = cc.encrypt(password);
    System.out.println(cpassword);
    System.out.println("---------------------");

    ac = new AdvancedCipher(cc);
    cpassword = ac.encrypt(password);
    System.out.println(cpassword);
    System.out.println("---------------------");
  }
}
