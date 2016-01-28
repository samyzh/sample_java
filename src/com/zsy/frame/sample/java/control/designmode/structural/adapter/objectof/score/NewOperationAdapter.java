package com.zsy.frame.sample.java.control.designmode.structural.adapter.objectof.score;

/**
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-05 12:08
 */
public class NewOperationAdapter implements ScoreOperation {
  @Override public int[] sort(int[] array) {
    return new int[0];
  }

  @Override public int search(int[] array, int key) {
    return 0;
  }
}
