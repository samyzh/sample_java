package com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.absfactory;



public class PizzaStroe {
	public static void main(String[] args) {
		
		OrderPizza mOrderPizza;
//		mOrderPizza=new	OrderPizza(new LDFactory());
		mOrderPizza=new	OrderPizza(new NYFactory());

	}

	

}
