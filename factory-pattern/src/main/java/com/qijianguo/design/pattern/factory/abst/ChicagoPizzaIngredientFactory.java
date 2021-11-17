package com.qijianguo.design.pattern.factory.abst;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        System.out.println("prepare thick crust dough...");
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Clams createClams() {
        System.out.println("prepare frozen clams...");
        return new FrozenClams();
    }
}
