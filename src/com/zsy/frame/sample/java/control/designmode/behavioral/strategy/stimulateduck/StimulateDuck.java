package com.zsy.frame.sample.java.control.designmode.behavioral.strategy.stimulateduck;

import com.zsy.frame.sample.java.control.designmode.behavioral.strategy.stimulateduck.duck.Duck;
import com.zsy.frame.sample.java.control.designmode.behavioral.strategy.stimulateduck.duck.GreenHeadDuck;
import com.zsy.frame.sample.java.control.designmode.behavioral.strategy.stimulateduck.duck.RedHeadDuck;
import com.zsy.frame.sample.java.control.designmode.behavioral.strategy.stimulateduck.flybehavior.NoFlyBehavior;
import com.zsy.frame.sample.java.control.designmode.behavioral.strategy.stimulateduck.quackbehavior.NoQuackBehavior;

public class StimulateDuck {

  public static void main(String[] args) {

    Duck mGreenHeadDuck = new GreenHeadDuck();
    Duck mRedHeadDuck = new RedHeadDuck();

    mGreenHeadDuck.display();
    mGreenHeadDuck.Fly();
    mGreenHeadDuck.Quack();
    mGreenHeadDuck.swim();

    mRedHeadDuck.display();
    mRedHeadDuck.Fly();
    mRedHeadDuck.Quack();
    mRedHeadDuck.swim();
    mRedHeadDuck.display();
    mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
    mRedHeadDuck.Fly();
    mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
    mRedHeadDuck.Quack();
  }
}
