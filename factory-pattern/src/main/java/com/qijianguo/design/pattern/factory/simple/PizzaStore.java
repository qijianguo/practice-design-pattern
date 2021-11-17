package com.qijianguo.design.pattern.factory.simple;

public class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String name) {
        // Pizza pizza = new CheesePizza();
        Pizza pizza = factory.createPizza(name);
        pizza.prepare();
        pizza.back();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
