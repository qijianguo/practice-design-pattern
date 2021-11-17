package com.qijianguo.design.pattern.factory.abst;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        System.out.println("prepare thin crust dough.");
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("prepare sauce");
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("prepare cheese");
        return new Cheese();
    }

    @Override
    public Clams createClams() {
        System.out.println("prepare fresh clams");
        return new FreshClams();
    }
}
