package com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.simplefactory;


import com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.pizza.CheesePizza;
import com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.pizza.GreekPizza;
import com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.pizza.PepperPizza;
import com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
