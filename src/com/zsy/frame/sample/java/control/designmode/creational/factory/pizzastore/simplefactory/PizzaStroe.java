package com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.simplefactory;


/**
 * simple factory logic
 */
public class PizzaStroe {
	public static void main(String[] args) {
		SimplePizzaFactory mSimplePizzaFactory;
		OrderPizza mOrderPizza;
		mOrderPizza=new	OrderPizza(new SimplePizzaFactory());
	}
}
