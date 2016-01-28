package com.zsy.frame.sample.java.control.designmode.behavioral.strategy.sort;

/**
 * 处理设置策略，不错的这样的处理,有这个环境下，可处理更多逻辑
 * 环境类在解决某个问题时可以采用多种策略，在环境类中维护一个对抽象策略类的引用实例；
 * 对于ArrayHandler(Context类)而言，在它与抽象策略类之间建立一个关联关系
 */
public class ArrayHandler {
  private Sort sortObj;

  public void setSortObj(Sort sortObj) {
    this.sortObj = sortObj;
  }

  public int[] sort(int arr[]) {
    sortObj.sort(arr);
    return arr;
  }
}