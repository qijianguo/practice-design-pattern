package com.qijianguo.design.pattern.factory.method;

public abstract class PizzaStore {

    public Pizza orderPizza(String name) {
        // Pizza pizza = new CheesePizza();
        Pizza pizza = createPizza(name);
        pizza.prepare();
        pizza.back();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String name);
}
