package com.zsy.frame.sample.java.control.designmode.behavioral.strategy.sort;

/**
 * 抽象策略类为所支持的算法声明了抽象方法，是所有策略类的父类；
 */
public interface Sort {
  public abstract int[] sort(int arr[]);
}