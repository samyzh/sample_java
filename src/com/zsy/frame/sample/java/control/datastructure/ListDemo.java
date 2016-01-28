package com.zsy.frame.sample.java.control.datastructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) {
		// List<String> strList = new ArrayList<String>();
		// List<String> strList2 = new ArrayList<String>();

		// strList.add("102");
		// strList.add("105");
		//
		// strList2.add("101");
		// strList2.add("102");
		// strList2.add("103");

		/*
		 * System.out.println("集合strList为：");
		 * for (String string : strList) {
		 * System.out.println(string);
		 * }
		 * System.out.println("集合strList2为：");
		 * for (String string : strList2) {
		 * System.out.println(string);
		 * }
		 * strList.retainAll(strList2);
		 * System.out.println("集合strList和strList2交集为：");
		 * for (String string : strList) {
		 * System.out.println(string);
		 * }
		 */

		String array1 = "1000027325-000527-000488-000482,1000027325-000547-000488-000482,1000027325-000527-000488-000483,1000027325-000547-000488-000483";
		String array2 = "1000027325-000527-000488-000483,1000027325-000547-000488-000483";
		String array3 = "1000027325-000527-000488-000482,1000027325-000527-000488-000483";
		 List<String> lastSkuIds = new ArrayList<String>();
//		List<List<String>> lastSkuIds = new ArrayList<List<String>>();
		// Arrays.asList返回的是一个特殊的数组，没有有remove和add方法;所以这里就没有retainAll()方法；
		// Exception in thread "main" java.lang.UnsupportedOperationException
		List<String> strList = Arrays.asList(array1.split(","));
		List<String> strList2 = Arrays.asList(array2.split(","));
		List<String> strList3 = Arrays.asList(array2.split(","));

		 lastSkuIds.addAll(strList);
		 lastSkuIds.addAll(strList2);
		 lastSkuIds.addAll(strList3);

		//		lastSkuIds.add(strList);
//		lastSkuIds.add(strList2);
//		List<String> lastSku = lastSkuIds.get(0);
//		for (List<String> temp : lastSkuIds) {
//			lastSku.retainAll(temp);
//		}
//		for (String string : lastSku) {
//			System.out.println(string);
//		}
		String tempid = findDuplicateWithOrder(lastSkuIds).get(0).toString();
		
//		System.out.println(tempid);
//			for (String value : lastSkuIds) {
//	            if (getEqualCount(lastSkuIds, value) == skuSelectMap.size())
//	                return value;
//			}
//			return lastSkuIds.get(0).toString();
	}
	
	private int getEqualCount(List<String> list, String compareStr) {
	    int result = 0;
        for (String value : list) {
            if (value.equals(compareStr)) result++;
        }
        return result;
	}

	/**
	 * @description：查找到重复的数据
	 * @author samy
	 * @date 2015年6月8日 下午5:25:01
	 */
	public static List findDuplicateWithOrder(List list) {
		Set set = new HashSet();
		List repeatList = new ArrayList();
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			Object element = iter.next();
			if (!set.add(element)) {
				repeatList.add(element);
			}
		}
		// 如果Bean，只有一项是。默认的填充一个对象；保持repeatList始终有一个以上数据
		if (repeatList.isEmpty()) {
			repeatList.addAll(set);
		}
		
		System.out.println("遍历这个list：");
		for (Object object : repeatList) {
			System.out.println(object);
		}
		return repeatList;
	}
}
