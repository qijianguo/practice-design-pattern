package com.qijianguo.design.pattern.factory.abst;

public class NYStylePizzaStore extends PizzaStore {

    private NYPizzaIngredientFactory ingredientFactory;

    public NYStylePizzaStore(NYPizzaIngredientFactory factory) {
        this.ingredientFactory = factory;
    }

    @Override
    Pizza createPizza(String name) {
        Pizza pizza;
        if ("cheese".equals(name)) {
            pizza = new NYStyleCheesePizza(ingredientFactory);
        } else if ("veggie".equals(name)) {
            pizza = new NYStyleCheesePizza(ingredientFactory);
        } else {
            throw new IllegalArgumentException("Pizza type not support！");
        }
        return pizza;
    }
}
