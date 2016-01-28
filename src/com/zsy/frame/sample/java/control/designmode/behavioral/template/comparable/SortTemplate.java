package com.zsy.frame.sample.java.control.designmode.behavioral.template.comparable;

/**
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-07 20:47
 */
public abstract class SortTemplate {
  public final void sort(Object[] objects) {
    for (int i = 0; i < objects.length - 1; i++) {
      if (compare(objects[i + 1]) > 0) {
        //                swap();
      } else {

      }
    }
  }

  protected abstract int compare(Object object);
}
