package com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.factorymethod;



import com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.pizza.LDCheesePizza;
import com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.pizza.LDPepperPizza;
import com.zsy.frame.sample.java.control.designmode.creational.factory.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;

    }

}
