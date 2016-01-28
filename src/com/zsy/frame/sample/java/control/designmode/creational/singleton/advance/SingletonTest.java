package com.zsy.frame.sample.java.control.designmode.creational.singleton.advance;

import java.util.Vector;

/**
 * @description：
 * 采用"影子实例"的办法为单例对象的属性同步更新
 * @author samy
 * @date 2015-3-18 下午11:26:49
 */
public class SingletonTest {

	private static SingletonTest instance = null;
	private Vector properties = null;

	public Vector getProperties() {
		return properties;
	}

	private SingletonTest() {
	}

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new SingletonTest();
		}
	}

	public static SingletonTest getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}

	public void updateProperties() {
		SingletonTest shadow = new SingletonTest();
		properties = shadow.getProperties();
	}
}