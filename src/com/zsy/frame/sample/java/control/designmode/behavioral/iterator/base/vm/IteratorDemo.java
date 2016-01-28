package com.zsy.frame.sample.java.control.designmode.behavioral.iterator.base.vm;

import java.util.*;

/**
 * Java迭代器(不利于倒序查询)
 * 在JDK中，Iterator接口具有如下3个基本方法
 * (1) Object next()：通过反复调用next()方法可以逐个访问聚合中的元素。
 * (2) boolean hasNext()：hasNext()方法用于判断聚合对象中是否还存在下一个元素，为了不抛出异常，必须在调用next()之前先调用hasNext()。如果迭代对象仍然拥有可供访问的元素，那么hasNext()返回true。
 * (3) void remove()：用于删除上次调用next()时所返回的元素。
 *
 * Iterator iterator = collection.iterator();   //collection是已实例化的集合对象
 * iterator.next();	 	// 跳过第一个元素
 * iterator.remove(); // 删除第一个元素
 * iterator.next();  //该语句不能去掉
 * iterator.remove();
 */
public class IteratorDemo {
  public static void process(Collection c) {
    Iterator i = c.iterator();//创建迭代器对象
    //通过迭代器遍历聚合对象
    while (i.hasNext()) {
      System.out.println(i.next().toString());
    }
  }

  /**
   * 在Java语言中，我们可以直接使用JDK内置的迭代器来遍历聚合对象中的元素
   */
  public static void main(String args[]) {
    /**
     *在HashSet中合并了重复元素，并且元素以随机次序输出，其结果与使用ArrayList不相同，是有序的
     *由此可见，通过使用迭代器模式，使得更换具体聚合类变得非常方便，
     *而且还可以根据需要增加新的聚合类，新的聚合类只需要实现Collection接口，无须修改原有类库代码，符合“开闭原则”
     */
    Collection list = new HashSet();//创建一个HashSet类型的聚合对象
    //		Collection list=new ArrayList();//创建一个ArrayList类型的聚合对象
    list.add("Cat");
    list.add("Dog");
    list.add("Pig");
    list.add("Dog");
    list.add("Monkey");
    process(list);
  }
}