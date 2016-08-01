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
public class ListTest2 {
	/**
	 * 
	 * 两个数组合并，去掉重复的，然后再排序
	 * 
	 */
	public static void main(String[] args) {

		int[] arr2 = { 1, 2, 3, 4, 5 };
		int[] arr1 = { 3, 4, 5, 6, 7 };

		// Set是不允许重复的，所以将数组的值全部放在Set对象中
		Set set = new HashSet<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			set.add(arr2[i]);
		}

		// 得到的是不重复的值，Set的长度
		System.out.println(set.size());

		Iterator i = set.iterator();
		int[] arrays = new int[set.size()];
		int num = 0;
		System.out.println("");
		while (i.hasNext()) {
			int a = (Integer) i.next();
			arrays[num] = a;
			num = num + 1;
			System.out.print(num +"=====");
		}

		System.out.println("");
		for (int s = 0; s < arrays.length; s++) {
			System.out.print(arrays[s]+"=====");
		}

		// 对结果进行排序
		Arrays.sort(arrays);
		System.out.println("");
		for (int s = 0; s < arrays.length; s++) {
			System.out.print(arrays[s]+"=====");
		}
	}

}
