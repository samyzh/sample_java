package com.zsy.frame.sample.java.control.designmode.behavioral.iterator.base.extend;

class NewCollection implements MyCollection {
  /**
   * 可把数据移动到客户端，通过构造传递过来显示
   */
  private Object[] obj = { "dog", "pig", "cat", "monkey", "pig" };

  public MyIterator createIterator() {
    return new NewIterator();
  }

  private class NewIterator implements MyIterator {
    private int currentIndex = 0;

    public void first() {
      currentIndex = 0;
    }

    public void next() {
      if (currentIndex < obj.length) {
        currentIndex++;
      }
    }

    public void previous() {
      if (currentIndex > 0) {
        currentIndex--;
      }
    }

    public boolean isLast() {
      return currentIndex == obj.length;
    }

    public boolean isFirst() {
      return currentIndex == 0;
    }

    public Object currentItem() {
      return obj[currentIndex];
    }
  }
}