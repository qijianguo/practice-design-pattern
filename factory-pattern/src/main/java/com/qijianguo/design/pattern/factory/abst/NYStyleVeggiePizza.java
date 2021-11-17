package com.qijianguo.design.pattern.factory.abst;

public class NYStyleVeggiePizza extends Pizza {

    private NYPizzaIngredientFactory ingredientFactory;

    public NYStyleVeggiePizza(NYPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        setCheese(ingredientFactory.createCheese());
        setClams(ingredientFactory.createClams());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
    }
}
