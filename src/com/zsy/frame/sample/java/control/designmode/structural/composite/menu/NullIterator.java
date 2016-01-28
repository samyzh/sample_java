package com.zsy.frame.sample.java.control.designmode.structural.composite.menu;

import java.util.Iterator;

public class NullIterator implements Iterator {

  @Override public boolean hasNext() {
    return false;
  }

  @Override public Object next() {
    return null;
  }

  @Override public void remove() {

  }
}
