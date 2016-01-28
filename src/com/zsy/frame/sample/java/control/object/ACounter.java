package com.zsy.frame.sample.java.control.object;

/**
 * @description：EIT(模型)
 * @author samy
 * @date 2015-3-17 下午9:41:13
 */
public abstract class ACounter {// <E>

	public int runSum() {
		int N;
		N = this.getCount();
		// N = this.onCount();
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			// for (int i = 0; i < N; i++) {
			// sum += i;
			sum += onItem(i);
		}
		// System.out.println("1+2+3+...="+sum);//45
		System.out.println("年终总结=" + sum);

		return sum;
	}

	public int getCount() {
		return onCount();
	}

	// <I>
	protected abstract int onCount();

	protected abstract int onItem(int k);
}
