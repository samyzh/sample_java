package com.zsy.frame.sample.java.control.designmode.creational.builder.gamerole;//角色建造器：抽象建造者

//Builder：抽象建造者

/**
 * 以上两种对Director类的省略方式都不影响系统的灵活性和可扩展性，同时还简化了系统结构，
 * 但加重了抽象建造者类的职责，如果construct()方法较为复杂，待构建产品的组成部分较多，
 * 建议还是将construct()方法单独封装在Director中，这样做更符合“单一职责原则”。
 */
abstract class ActorBuilder {
  protected static Actor actor = new Actor();

  //如果不是单独一个类时，不写抽象类，直接可以做成返回对象Build本身，做成可链接配置
  //public ActorBuilder buildType();
  public abstract void buildType();

  public abstract void buildSex();

  public abstract void buildFace();

  public abstract void buildCostume();

  public abstract void buildHairstyle();

  /**
   * 方式一：全部模式
   */
  ////protected Actor actor = new Actor();
  ////工厂方法，返回一个完整的游戏角色对象
  public Actor createActor() {
    return actor;
  }

  /**
   * 方法二：省略Director模式
   */
  public static Actor construct(ActorBuilder ab) {
    ab.buildType();
    ab.buildSex();
    ab.buildFace();
    ab.buildCostume();
    ab.buildHairstyle();
    return actor;
  }

  /**
   * 方式三：还有一种更简单的处理方法，可以将construct()方法的参数去掉，直接在construct()方法中调用buildPartX()方法
   * 此时，construct()方法定义了其他buildPartX()方法调用的次序，为其他方法的执行提供了一个流程模板，这与我们在后面要学习的模板方法模式非常类似。
   */
  public Actor construct() {
    this.buildType();
    this.buildSex();
    this.buildFace();
    this.buildCostume();
    //this.buildHairstyle();
    //通过钩子方法来控制产品的构建
    if(!this.isBareheaded())
    {
      this.buildHairstyle();
    }
    return actor;
  }

  /**
   * 钩子方法的引入
   *
   * 建造者模式除了逐步构建一个复杂产品对象外，还可以通过Director类来更加精细地控制产品的创建过程
   * 例如增加一类称之为钩子方法(HookMethod)的特殊方法来控制是否对某个buildPartX()的调用
   */
  /**
   * 用于判断某个角色是否为“光头(Bareheaded)”，在ActorBuilder为之提供一个默认实现，其返回值为false
   * @return
   */
  public boolean isBareheaded() {
    return false;
  }
}