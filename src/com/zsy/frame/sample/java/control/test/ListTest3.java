package com.zsy.frame.sample.java.control.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/**
 * 数组去重复方式二：
 * @author samy
 *
 */
public class ListTest3 {
	/**
	 * 
	 * 两个数组合并，去掉重复的，然后再排序
	 * 
	 */
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
		  System.out.println("数组list1："+list1); 
		  for (Integer integer : list1) {
			  System.out.print(integer); 
		  }
		  
		  System.out.println();
		  System.out.println("数组list2："+list2); 
		  for (Integer integer : list2) {
			  System.out.print(integer); 
		  }
		  
		  System.out.println();
//		  list1.removeAll(list2);
		  for (int i = 0; i < list1.size(); i++) {
			  for (int j = 0; j < list2.size(); j++) {
				  if(list1.get(i).equals(list2.get(j))){
					  list1.remove(i);
					  i--;
//					  break;
				  }
			}
		}
		  System.out.println("数组list1："+list1); 
		  
	}

}
