package com.zsy.frame.sample.java.control.datastructure;
import java.util.ArrayList;
import java.util.List;

public class TestCollection {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		List<String> strList2 = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			strList.add("aaa>>" + i);
			strList2.add("aaa>>" + (10 - i));
		}

		System.out.println("================求出交集===========");
		strList2.retainAll(strList);
		System.out.println("交集大小：" + strList2.size());

		
		System.out.println("================求出并集  ===========");
//        strList2.removeAll(strList);  
//        strList2.addAll(strList);  
//        System.out.println("并集大小：" + strList2.size());        
		for (int i = 0; i < strList2.size(); i++) {
			System.out.println(strList2.get(i));
		}
	}
}