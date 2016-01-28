package com.zsy.frame.sample.java.control.designmode.behavioral.state.bbs;

/**
 * State: 抽象状态类
 * 状态模式的关键是引入了一个抽象类来专门表示对象的状态，这个类我们叫做抽象状态类，
 * 而对象的每一种具体状态类都继承了该类，并在不同具体状态类中实现了不同状态的行为，
 * 包括各种状态之间的转换 (checkState())
 */
public abstract class AbstractState {
  protected ForumAccount acc;
  protected int point;
  protected String stateName;

  public abstract void checkState(int score);

  public void downloadFile(int score) {
    System.out.println(acc.getName() + "下载文件，扣除" + score + "积分。");
    this.point -= score;
    checkState(score);
    System.out.println("剩余积分为：" + this.point + "，当前级别为：" + acc.getState().stateName + "。");
  }

  public void writeNote(int score) {
    System.out.println(acc.getName() + "发布留言" + "，增加" + score + "积分。");
    this.point += score;
    checkState(score);
    System.out.println("剩余积分为：" + this.point + "，当前级别为：" + acc.getState().stateName + "。");
  }

  public void replyNote(int score) {
    System.out.println(acc.getName() + "回复留言，增加" + score + "积分。");
    this.point += score;
    checkState(score);
    System.out.println("剩余积分为：" + this.point + "，当前级别为：" + acc.getState().stateName + "。");
  }

  public void setPoint(int point) {
    this.point = point;
  }

  public int getPoint() {
    return (this.point);
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }

  public String getStateName() {
    return (this.stateName);
  }
}