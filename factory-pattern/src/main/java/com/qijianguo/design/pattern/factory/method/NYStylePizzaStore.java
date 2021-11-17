package com.qijianguo.design.pattern.factory.method;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String name) {
        Pizza pizza;
        if ("cheese".equals(name)) {
            pizza = new NYStyleCheesePizza();
        } else if ("veggie".equals(name)) {
            pizza = new NYStyleCheesePizza();
        } else {
            throw new IllegalArgumentException("Pizza type not support！");
        }
        return pizza;
    }
}
