package com.qijianguo.design.pattern.factory.abst;

/**
 * @author qijianguo
 */
public class NYStyleCheesePizza extends Pizza {

    private NYPizzaIngredientFactory ingredientFactory;

    public NYStyleCheesePizza(NYPizzaIngredientFactory factory) {
        this.ingredientFactory = factory;
    }

    @Override
    void prepare() {
        setDough(ingredientFactory.createDough());
        setClams(ingredientFactory.createClams());
    }
}
