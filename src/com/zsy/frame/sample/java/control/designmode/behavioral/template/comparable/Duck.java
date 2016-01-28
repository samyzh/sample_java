package com.zsy.frame.sample.java.control.designmode.behavioral.template.comparable;

/**
 * @author: samy(hongfeiliuxing@gmail.com)
 * @datetime: 2015-08-07 20:49
 */
public class Duck implements Comparable {
  String name = "";
  int weight = 1;

  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  @Override public String toString() {
    return "Duck{" +
        "name='" + name + '\'' +
        ", weight=" + weight +
        '}';
  }

  @Override public int compareTo(Object another) {
    Duck duckAnother = (Duck) another;
    if (this.weight > duckAnother.weight) {
      return 1;
    } else if (this.weight < duckAnother.weight) {
      return -1;
    }
    return 0;
  }
}
