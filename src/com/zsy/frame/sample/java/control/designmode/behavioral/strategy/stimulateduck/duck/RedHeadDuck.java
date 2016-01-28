package com.zsy.frame.sample.java.control.designmode.behavioral.strategy.stimulateduck.duck;


import com.zsy.frame.sample.java.control.designmode.behavioral.strategy.stimulateduck.flybehavior.BadFlyBehavior;
import com.zsy.frame.sample.java.control.designmode.behavioral.strategy.stimulateduck.quackbehavior.GeGeQuackBehavior;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		mFlyBehavior = new BadFlyBehavior();
		mQuackBehavior = new GeGeQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**RedHead**");
	}

}
