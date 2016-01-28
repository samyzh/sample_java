package com.zsy.frame.sample.java.control.designmode.creational.builder.gamerole;

/**
 * 建造者模式包含如下角色：
 * Builder：抽象建造者
 * ConcreteBuilder：具体建造者
 * Director：指挥者
 * Product：产品角色
 */
class Client {

  public static void main(String args[]) {
    ActorBuilder ab; //针对抽象建造者编程

    //ab = new AngelBuilder();
    ab = new DevilBuilder();
    //ab =  (ActorBuilder)XMLUtil.getBean(); //反射生成具体建造者对象
    Actor actor;
    /**
     * 方式一：全部模式
     */
    //        指挥者
    //ActorController ac = new ActorController();
    //actor = ac.construct(ab); //通过指挥者创建完整的建造者对象

    /**
     * 方法二：省略Director指挥者模式
     */
    //actor =  ActorBuilder.construct(ab);


    /**
     * 方式三：还有一种更简单的处理方法，可以将construct()方法的参数去掉，直接在construct()方法中调用buildPartX()方法
     */
    actor = ab.construct();

    String type = actor.getType();
    System.out.println(type + "的外观：");
    System.out.println("性别：" + actor.getSex());
    System.out.println("面容：" + actor.getFace());
    System.out.println("服装：" + actor.getCostume());
    System.out.println("发型：" + actor.getHairstyle());
  }
}