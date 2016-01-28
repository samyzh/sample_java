package com.zsy.frame.sample.java.control.designmode.behavioral.strategy.sort;

/**
 * 可跟适配器模式对比
 */
public class Client {
  public static void main(String args[]) {
    int arr[] = { 1, 4, 6, 2, 5, 3, 7, 10, 9 };
    int result[];
    ArrayHandler ah = new ArrayHandler();

    Sort sort;
    //       sort=(Sort)XMLUtil.getBean();
    //       sort= new QuickSort();
    sort = new InsertionSort();

    ah.setSortObj(sort); //设置具体策略
    result = ah.sort(arr);

    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i] + ",");
    }
  }
}