package com.qijianguo.design.pattern.factory.abst;

public abstract class PizzaStore {

    public Pizza orderPizza(String name) {
        // Pizza pizza = new CheesePizza();
        Pizza pizza = createPizza(name);
        System.out.println("order pizza ：" + name);
        pizza.prepare();
        pizza.back();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String name);
}
