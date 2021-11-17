package com.qijianguo.design.pattern.factory.method;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String name) {
        Pizza pizza;
        if ("cheese".equals(name)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("veggie".equals(name)) {
            pizza = new ChicagoStyleCheesePizza();
        } else {
            throw new IllegalArgumentException("Pizza type not support！");
        }
        return pizza;
    }
}
