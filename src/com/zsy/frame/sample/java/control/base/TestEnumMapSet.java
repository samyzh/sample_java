package com.zsy.frame.sample.java.control.base;

import java.util.EnumMap;
import java.util.EnumSet;

/**
 * @description：
 * JDK5.0 中在增加 Enum 类的同时，也增加了两个工具类 EnumSet 和 EnumMap，这两个类都放在 java.util 包中。
 * 
 * 用法七：关于枚举集合的使用
java.util.EnumSet和java.util.EnumMap是两个枚举集合。
EnumSet保证集合中的元素不重复;
EnumMap中的 key是enum类型，而value则可以是任意类型。关于这个两个集合的使用就不在这里赘述，可以参考JDK文档

Enum 类型提出给 JAVA 编程带了了极大的便利，让程序的控制更加的容易，也不容易出现错误。
所以在遇到需要控制程序流程时候，可以多想想是否可以利用 enum 来实现。
 * @author samy
 * @date 2015年7月21日 下午5:16:49
 */
public class TestEnumMapSet {

	// 1.定义枚举类型

	public enum Light {

		// 利用构造函数传参

		RED(1), GREEN(3), YELLOW(2);

		// 定义私有变量

		private int nCode;

		// 构造函数，枚举类型只能为私有

		private Light(int _nCode) {

			this.nCode = _nCode;

		}

		@Override
		public String toString() {

			return String.valueOf(this.nCode);

		}

	}

	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// 1.遍历枚举类型

		System.out.println("演示枚举类型的遍历 ......");

		testTraversalEnum();

		// 2.演示EnumMap对象的使用

		System.out.println("演示EnmuMap对象的使用和遍历.....");

		testEnumMap();

		// 3.演示EnmuSet的使用

		System.out.println("演示EnmuSet对象的使用和遍历.....");

		testEnumSet();

	}

	/**
	 * 
	 * 演示枚举类型的遍历
	 */

	private static void testTraversalEnum() {

		Light[] allLight = Light.values();

		for (Light aLight : allLight) {

			System.out.println("当前灯name：" + aLight.name());

			System.out.println("当前灯ordinal：" + aLight.ordinal());

			System.out.println("当前灯：" + aLight);

		}

	}

	/**
	 * 
	 * 演示EnumMap的使用，EnumMap跟HashMap的使用差不多，只不过key要是枚举类型
	 * 与 EnumSet 类似，EnumMap 也是一个高性能的 Map 接口实现，用来管理使用枚举类型作为 keys 的映射表，内部是通过数组方式来实现。
	 * EnumMap 将丰富的和安全的 Map 接口与数组快速访问结合到一起，如果你希望要将一个枚举类型映射到一个值，你应该使用 EnumMap。
	 */

	private static void testEnumMap() {

		// 1.演示定义EnumMap对象，EnumMap对象的构造函数需要参数传入,默认是key的类的类型

		EnumMap<Light, String> currEnumMap = new EnumMap<Light, String>(

		Light.class);

		currEnumMap.put(Light.RED, "红灯");

		currEnumMap.put(Light.GREEN, "绿灯");

		currEnumMap.put(Light.YELLOW, "黄灯");

		// 2.遍历对象

		for (Light aLight : Light.values()) {

			System.out.println("[key=" + aLight.name() + ",value="

			+ currEnumMap.get(aLight) + "]");

		}

	}

	/**
	 * 
	 * 演示EnumSet如何使用，EnumSet是一个抽象类，获取一个类型的枚举类型内容<BR/>
	 * 可以使用allOf方法
	 * 
	 * EnumSet 是一个针对枚举类型的高性能的 Set 接口实现。EnumSet 中装入的所有枚举对象都必须是同一种类型，在其内部，是通过 bit-vector 来实现，也就是通过一个 long 型数。EnumSet 支持在枚举类型的所有值的某个范围中进行迭代。回到上面日期枚举的例子上：
	 */

	private static void testEnumSet() {

		EnumSet<Light> currEnumSet = EnumSet.allOf(Light.class);

		for (Light aLightSetElement : currEnumSet) {

			System.out.println("当前EnumSet中数据为：" + aLightSetElement);

		}

//		你能够在每周七天日期中进行迭代，EnumSet 类提供一个静态方法 range 让迭代很容易完成：
		EnumSet<Light> currEnumSet2 = EnumSet.range(Light.RED, Light.GREEN);
		for (Light aLightSetElement : currEnumSet2) {

			System.out.println("当前EnumSet中包含的数据为：" + aLightSetElement.name());
		}

		// EnumSet 还提供了很多个类型安全的获取子集的 of 方法，使你很容易取得子集：
		EnumSet<Light> currEnumSet3 = EnumSet.of(Light.GREEN, Light.RED);
		for (Light aLightSetElement : currEnumSet3) {

			System.out.println("当前EnumSet中包含的数据为：" + aLightSetElement.name());
		}

	}

}