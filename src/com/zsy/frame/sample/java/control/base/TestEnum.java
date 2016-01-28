package com.zsy.frame.sample.java.control.base;

/**
 * 枚举用法详解
 *  使用enum的职责链(Chain of Responsibility) .这个关系到设计模式的职责链模式。以多种不同的方法来解决一个问题。
 *  然后将他们链接在一起。当一个请求到来时，遍历这个链，直到链中的某个解决方案能够处理该请求。
 */
public class TestEnum {
	/**
	 * 普通枚举
	 *	用法一：常量
	在JDK1.5 之前，我们定义常量都是： public static fianl.... 。现在好了，有了枚举，可以把相关的常量分组到一个枚举类型里，而且枚举提供了比常量更多的方法。
	 */
	public enum ColorEnum {
		red, green, yellow, blue;
	}

	/**
	 * 枚举像普通的类一样可以添加属性和方法，可以为它添加静态和非静态的属性或方法
	 */
	public enum SeasonEnum {
		// 注：枚举写在最前面，否则编译出错
		spring, summer, autumn, winter;

		private final static String position = "test";

		public static SeasonEnum getSeason() {
			if ("test".equals(position)) return spring;
			else return winter;
		}
	}

	/**
	 * 如何避免错误使用 Enum
	不过在使用 Enum 时候有几个地方需要注意：
	1:enum 类型不支持 public 和 protected 修饰符的构造方法，因此构造函数一定要是 private 或 friendly 的。也正因为如此，所以枚举对象是无法在程序中通过直接调用其构造方法来初始化的。
	2:定义 enum 类型时候，如果是简单类型，那么最后一个枚举值后不用跟任何一个符号；但如果有定制方法，那么最后一个枚举值与后面代码要用分号';'隔开，不能用逗号或空格。
	3:由于 enum 类型的值实际上是通过运行期构造出对象来表示的，所以在 cluster 环境下，每个虚拟机都会构造出一个同义的枚举对象。因而在做比较操作时候就需要注意，
	  如果直接通过使用等号 ( ‘ == ’ ) 操作符，这些看似一样的枚举值一定不相等，因为这不是同一个对象实例。 
	 */

	/**
	 * 性别
	 * 实现带有构造器的枚举
	 * 用法三：向枚举中添加新方法
	如果打算自定义自己的方法，那么必须在enum实例序列的最后添加一个分号。而且 Java 要求必须先定义 enum 实例。
	
	如何定制 Enum 类型
	除了以上这种最常见的枚举定义形式外，如果需要给枚举类型增加一些复杂功能，也可以通过类似 class 的定义来给枚举进行定制。
	比如要给 enum 类型增加属性
	 */
	public enum Gender {
		// 通过括号赋值,而且必须带有一个参构造器和一个属性跟方法，否则编译出错
		// 赋值必须都赋值或都不赋值，不能一部分赋值一部分不赋值；如果不赋值则不能写构造器，赋值编译也出错
		MAN("MAN", 1), WOMEN("WOMEN", 2);
		// 成员变量
		private String name;
		private int index;

		// 构造方法
		// 构造器默认也只能是private, 从而保证构造函数只能在内部使用
		Gender(String value, int index) {
			this.name = value;
		}

		// 普通方法
		public static String getName(int index) {
			for (Gender c : Gender.values()) {
				if (c.getIndex() == index) { return c.name; }
			}
			return null;
		}

		// get set 方法
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		// 覆盖方法
		/**
		 *   用法四：覆盖枚举的方法
		  下面给出一个toString()方法覆盖的例子。
		 */
		@Override
		public String toString() {
			return this.index + "_" + this.name;
		}
	}

	/**
	 * 用法五：实现接口
	所有的枚举都继承自java.lang.Enum类。由于Java 不支持多继承，所以枚举对象不能再继承其他类。
	 * 
	 * 订单状态
	 * 实现带有抽象方法的枚举
	 */
	public enum OrderState {
		// public enum OrderState implements Behaviour {
		/** 已取消 */
		CANCEL {
			public String getName() {
				return "已取消";
			}
		},
		/** 待审核 */
		WAITCONFIRM {
			public String getName() {
				return "待审核";
			}
		},
		/** 等待付款 */
		WAITPAYMENT {
			public String getName() {
				return "等待付款";
			}
		},
		/** 正在配货 */
		ADMEASUREPRODUCT {
			public String getName() {
				return "正在配货";
			}
		},
		/** 等待发货 */
		WAITDELIVER {
			public String getName() {
				return "等待发货";
			}
		},
		/** 已发货 */
		DELIVERED {
			public String getName() {
				return "已发货";
			}
		},
		/** 已收货 */
		RECEIVED {
			public String getName() {
				return "已收货";
			}
		};

		public abstract String getName();
	}

	public interface Behaviour {
		void print();

		String getInfo();
	}

	/**
	 * @description：用法六：使用接口组织枚举
	 * @author samy
	 * @date 2015年7月21日 下午5:14:06
	 */
	public interface Food {
		enum Coffee implements Food {
			BLACK_COFFEE, DECAF_COFFEE, LATTE, CAPPUCCINO
		}

		enum Dessert implements Food {
			FRUIT, CAKE, GELATO
		}
	}

	public static void main(String[] args) {
		/**
		 * 用法二：switch
		  JDK1.6之前的switch语句只支持int,char,enum类型，使用枚举，能让我们的代码可读性更强。
		 */
		// 枚举是一种类型，用于定义变量，以限制变量的赋值；赋值时通过“枚举名.值”取得枚举中的值
		ColorEnum colorEnum = ColorEnum.blue;
		switch (colorEnum) {
			case red:
				System.out.println("color is red");
				break;
			case green:
				System.out.println("color is green");
				break;
			case yellow:
				System.out.println("color is yellow");
				break;
			case blue:
				System.out.println("color is blue");
				break;
		}

		// 遍历枚举
		System.out.println("遍历ColorEnum枚举中的值");
		for (ColorEnum color : ColorEnum.values()) {
			System.out.println(color);
		}

		// 获取枚举的个数
		System.out.println("ColorEnum枚举中的值有" + ColorEnum.values().length + "个");

		// 获取枚举的索引位置，默认从0开始
		System.out.println(ColorEnum.red.ordinal());// 0
		System.out.println(ColorEnum.green.ordinal());// 1
		System.out.println(ColorEnum.yellow.ordinal());// 2
		System.out.println(ColorEnum.blue.ordinal());// 3

		// 枚举默认实现了java.lang.Comparable接口
		System.out.println(ColorEnum.red.compareTo(ColorEnum.green));// -1

		// --------------------------
		System.out.println("===========");
		System.err.println("季节为" + SeasonEnum.getSeason());

		// --------------
		System.out.println("===========");
		for (Gender gender : Gender.values()) {
			System.out.println(gender.name);
		}

		// --------------
		System.out.println("===========");
		for (OrderState order : OrderState.values()) {
			System.out.println(order.getName());
		}
	}

}