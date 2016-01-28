package com.zsy.frame.sample.java.control.designmode.structural.decorator.coffeebar;

import com.zsy.frame.sample.java.control.designmode.structural.decorator.coffeebar.coffee.Decaf;
import com.zsy.frame.sample.java.control.designmode.structural.decorator.coffeebar.coffee.LongBlack;
import com.zsy.frame.sample.java.control.designmode.structural.decorator.coffeebar.decorator.Chocolate;
import com.zsy.frame.sample.java.control.designmode.structural.decorator.coffeebar.decorator.Milk;

/**
 * 装饰者模式就像打包一个快递
 * 1）主体：陶瓷、衣服
 * 2）包装：报纸填充、塑料泡沫、纸板、木板
 * <p>
 * 咖啡馆订单项目
 * 咖啡种类：Espresso ShortBlack LongBlack Decaf
 * 调料：Milk Soy Chocolate
 * 扩展性好，改动方便，维护方便
 *
 *
 * 可学习下这个项目的包结构和其命名规范
 * 装饰者模式下的订单：2份巧克力+一份牛奶的LongBlack
 */
public class CoffeeBar {
  public static void main(String[] args) {

    Drink order;
    //        一杯无咖啡因咖啡 3.0f
    order = new Decaf();
    System.out.println("order1 price:" + order.cost());
    System.out.println("order1 desc:" + order.getDescription());

    System.out.println("****************");

    // 一杯LongBlack咖啡 6.0f
    order = new LongBlack();
    //        加牛奶  2.0f
    order = new Milk(order);
    //        加巧克力 3.0f
    order = new Chocolate(order);
    //        加巧克力 3.0f
    order = new Chocolate(order);
    System.out.println("order2 price:" + order.cost());
    System.out.println("order2 desc:" + order.getDescription());
  }
}
