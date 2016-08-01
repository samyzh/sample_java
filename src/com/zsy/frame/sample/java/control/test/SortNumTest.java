package com.zsy.frame.sample.java.control.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNumTest {
	//
	// public static void main(String[] args) {
	// String[] strs = new String[]{"2.20029", "advesd2", "2.20009", "cdsaew1",
	// "2.20001", "2.20029", "abbdsa"};
	// Arrays.sort(strs);
	// for(String str : strs) {
	// System.out.println(str);
	// }
	// }

	public static void main(String[] args) {
		User user1 = new User();
		user1.setName("2.20029");
		user1.setOrder(1);
		user1.setFixNew("3.0");
		User user2 = new User();
		user2.setName("2.20009");
		user2.setOrder(3);
		user2.setFixNew("200");

		User user3 = new User();
		user3.setName("2.20040");
		user3.setOrder(2);
		user3.setFixNew("40");

		User user4 = new User();
		user4.setName("2.20041");
		user4.setOrder(1);
		user4.setFixNew("4.0");
		List<User> list = new ArrayList<User>();
		// 此处add user2再add user1
		list.add(user2);
		list.add(user1);
		list.add(user4);
		list.add(user3);
		// 第一种方法：
//		Collections.sort(list);
//		Collections.reverse(list);
		for (User u : list) {
			System.out.println(u);
			// System.out.println(u.getOrder());
		}
		// 第二种方法：
		/*
		 * Collections.sort(list, new Comparator<User>() {
		 * 
		 * @Override public int compare(User lhs, User rhs) { // return
		 * lhs.getName().compareTo(rhs.getName());
		 * 
		 * if (lhs.getAge() > rhs.getAge()) { return 1; } else if (lhs.getAge()
		 * == rhs.getAge()) { if (lhs.getHeight() > o.getHeight()) { return 1; }
		 * else if (lhs.getHeight() == rhs.getHeight()) { return 0; } else {
		 * return -1; } } else { return -1; }
		 * 
		 * } }); // Collections.reverse(list); for (User u : list) {
		 * System.out.println(u); // System.out.println(u.getOrder()); }
		 */

	}

}
