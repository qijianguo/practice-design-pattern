package com.qijianguo.design.pattern.factory.simple;

public class SimplePizzaFactory {

    public Pizza createPizza(String name) {
        Pizza pizza;
        if ("cheese".equals(name)) {
            pizza = new CheesePizza();
        } else if ("veggie".equals(name)) {
            pizza = new VeggiePizza();
        } else {
            throw new IllegalArgumentException("Pizza type not support！");
        }
        return pizza;
    }
}
