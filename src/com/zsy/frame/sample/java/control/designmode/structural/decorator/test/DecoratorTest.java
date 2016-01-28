package com.zsy.frame.sample.java.control.designmode.structural.decorator.test;

/**
 * 需要注意的问题
 一个装饰类的接口必须与被装饰类的接口保持相同，对于客户端来说无论是装饰之前的对象还是装饰之后的对象都可以一致对待。
 尽量保持具体构件类Component作为一个“轻”类，也就是说不要把太多的逻辑和状态放在具体构件类中，可以通过装饰类对其进行扩展。
 如果只有一个具体构件类而没有抽象构件类，那么抽象装饰类可以作为具体构件类的直接子类。
 */
public class DecoratorTest {

  public static void main(String[] args) {
    Sourceable source = new Source();
    Sourceable obj = new Decorator(source);
    obj.method();
  }
} 