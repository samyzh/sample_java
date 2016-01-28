package com.zsy.frame.sample.java.control.designmode.behavioral.strategy.stimulateduck.duck;


import com.zsy.frame.sample.java.control.designmode.behavioral.strategy.stimulateduck.flybehavior.GoodFlyBehavior;
import com.zsy.frame.sample.java.control.designmode.behavioral.strategy.stimulateduck.quackbehavior.GaGaQuackBehavior;

public class GreenHeadDuck extends Duck {

	public GreenHeadDuck() {
		mFlyBehavior = new GoodFlyBehavior();
		mQuackBehavior = new GaGaQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**GreenHead**");
	}

}