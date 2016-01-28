package com.zsy.frame.sample.java.control.designmode.creational.builder.gamerole;//恶魔角色建造器：具体建造者

//恶魔角色建造器：具体建造者

/**
 * 如果某个角色无须构建头发部件，例如“恶魔(Devil)”，则对应的具体建造器DevilBuilder将覆盖isBareheaded()方法，并将返回值改为true
 */
class DevilBuilder extends ActorBuilder {
  public void buildType() {
    actor.setType("恶魔");
  }

  public void buildSex() {
    actor.setSex("妖");
  }

  public void buildFace() {
    actor.setFace("丑陋");
  }

  public void buildCostume() {
    actor.setCostume("黑衣");
  }

  public void buildHairstyle() {
    actor.setHairstyle("光头");
  }

  //覆盖钩子方法
  public boolean isBareheaded() {
    return true;
  }
}