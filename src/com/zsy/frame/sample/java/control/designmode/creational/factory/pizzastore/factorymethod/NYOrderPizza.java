package com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.factorymethod;

//import com.java.jikexueyuan.pizzastore.pizza.NYCheesePizza;
//import com.java.jikexueyuan.pizzastore.pizza.NYPepperPizza;
//import com.java.jikexueyuan.pizzastore.pizza.Pizza;

import com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.pizza.NYCheesePizza;
import com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.pizza.NYPepperPizza;
import com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.pizza.Pizza;

public class NYOrderPizza extends OrderPizza {

	@Override
	Pizza createPizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
