package com.zsy.frame.sample.java.control.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 数组去重复测试
 * 
 * @author samy
 *
 */
public class ListDup {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("1");
		
		System.out.println("去重复前：");
		for (String string : list1) {
			System.out.println(string);
		}
		
		list1 = removeDuplicateWithOrder(list1);
		System.out.println("去重复后：");
		for (String string : list1) {
			System.out.println(string);
		}
		
		/**
		 *     //更新继续添加的数据相同的数据;
    Iterator<ProductEntity> iterator = productsContinue.iterator();
    while (iterator.hasNext()) {
      ProductEntity next = iterator.next();
      if (next.getTQTY() == 0) {
        iterator.remove();
        continue;
      }
      if (productEntities.contains(next)) {
        int index = productEntities.indexOf(next);
        productEntities.set(index, next);
      }
    }
		 */
		
	}

	/**
	 * 移除重复的数据并且有序
	 * 
	 * @param list
	 * @return
	 */
	public static List removeDuplicateWithOrder(List list) {
		Set set = new HashSet();
		List newList = new ArrayList();
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			Object element = iter.next();
			if (set.add(element)) {// 没有加过的;
				newList.add(element);
			}
		}
		return newList;
	}

}
