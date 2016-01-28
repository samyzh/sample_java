package com.zsy.frame.sample.java.control.designmode.creational.builder.gamerole;
//游戏角色创建控制器：指挥者

/**
 * 我们可以在Director中对复杂产品的构建进行精细的控制，不仅指定buildPartX()方法的执行顺序，还可以控制是否需要执行某个buildPartX()方法。
 *
 * Director：指挥者
 * 指挥者类ActorController定义了construct()方法，
 * 该方法拥有一个抽象建造者ActorBuilder类型的参数，
 * 在该方法内部实现了游戏角色对象的逐步构建
 */
class ActorController {

  //逐步构建复杂产品对象

  public Actor construct(ActorBuilder ab) {
    Actor actor;
    ab.buildType();
    ab.buildSex();
    ab.buildFace();
    ab.buildCostume();
    //ab.buildHairstyle();
    //通过钩子方法来控制产品的构建
    if(!ab.isBareheaded())
    {
      ab.buildHairstyle();
    }
    actor = ab.createActor();
    return actor;
  }
}