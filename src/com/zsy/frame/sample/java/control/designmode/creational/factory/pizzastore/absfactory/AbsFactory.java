package com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.absfactory;

//import com.java.jikexueyuan.pizzastore.pizza.Pizza;

import com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
