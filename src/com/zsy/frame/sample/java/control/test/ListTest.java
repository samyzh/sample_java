package com.zsy.frame.sample.java.control.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 数组去重复方式一：
 * @author samy
 *
 */
public class ListTest {

	public static void main(String[] args) {  
		  List<Integer> list1 = new ArrayList<Integer>();  
		  List<Integer> list2 = new ArrayList<Integer>();  
		  list1.add(1);  
		  list1.add(2);  
		  list1.add(3);  
		  list1.add(4);  
		  list2.add(3);  
		  list2.add(4);  
		  list2.add(5);  
		  list2.add(6);  
		  List<Integer> list = new ArrayList<Integer>();  
		  list.addAll(list1);  
		  list.addAll(list2);  
		  System.out.println(list);  
		  
		  Collections.sort(list, new Comparator<Integer>() {  
		   public int compare(Integer o1, Integer o2) {  
		    return o1 - o2;  
		   }  
		  });  
		  System.out.println(list);  
		  
		  for (int i = 1; i < list.size(); i++) {  
		   if (list.get(i) == list.get(i - 1)) {  
		    list.remove(i);  
		   }  
		  }  
		  System.out.println(list);  
		 } 
}
