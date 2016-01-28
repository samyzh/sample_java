package com.zsy.frame.sample.java.control.designmode.structural.composite.fruitdish;

/**
 * 安全组合模式
 * 在标准形式（安全组合模式）下，去掉不必要的方法
 * 安全组合模式中，在抽象构件Component中没有声明任何用于管理成员对象的方法，
 * 而是在Composite类中声明并实现这些方法。这种做法是安全的，
 * 因为根本不向叶子对象提供这些管理成员对象的方法，对于叶子对象，客户端不可能调用到这些方法
 * 安全组合模式的缺点是不够透明，因为叶子构件和容器构件具有不同的方法，
 * 且容器构件中那些用于管理成员对象的方法没有在抽象构件类中定义，
 * 因此客户端不能完全针对抽象编程，必须有区别地对待叶子构件和容器构件
 * 在实际应用中，安全组合模式的使用频率也非常高，在Java AWT中使用的组合模式就是安全组合模式
 *
 * 在水果盘(Plate)中有一些水果，如苹果(Apple)、香蕉(Banana)、梨子(Pear)，当然大水果盘中还可以有小水果盘，
 * 现需要对盘中的水果进行遍历（吃），当然如果对一个水果盘执行“吃”方法，实际上就是吃其中的水果
 */
public class Client {
  public static void main(String a[]) {
    MyElement obj1, obj2, obj3, obj4, obj5;
    Plate plate1, plate2, plate3;

    obj1 = new Apple();
    obj2 = new Pear();
    plate1 = new Plate();
    plate1.add(obj1);
    plate1.add(obj2);

    obj3 = new Banana();
    obj4 = new Banana();
    plate2 = new Plate();
    plate2.add(obj3);
    plate2.add(obj4);

    //        当然大水果盘中还可以有小水果盘
    obj5 = new Apple();
    plate3 = new Plate();
    plate3.add(plate1);
    plate3.add(plate2);
    plate3.add(obj5);

    //        plate1.eat();//吃苹果！  吃梨子！
    plate3.eat();
  }
}
