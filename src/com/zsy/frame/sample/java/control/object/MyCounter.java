package com.zsy.frame.sample.java.control.object;

/**
 * @description：从框架到代码的演练
 * 
 * E(ACounter)
 * I(onCount)
 * T(MyCounter)
 * @author samy
 * @date 2015-3-17 下午9:43:30
 */
public class MyCounter extends ACounter {
	private int bonus[] = { 100, 300, 100, 300, 100, 300 };

	@Override
	protected int onCount() {
		// return 10;
		int n = bonus.length;
		if (n > 6) {
			n = 6;
		}
		return n;
	}

	@Override
	protected int onItem(int k) {
		return bonus[k - 1];
	}

	/** 
	 * @description：
	 * @author samy
	 * @date 2015-3-17 下午9:45:58
	 */
	public static void main(String[] args) {
		MyCounter counter = new MyCounter();
		counter.runSum();
	}

}
