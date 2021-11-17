package com.qijianguo.design.pattern.factory.abst;

/**
 * @author qijianguo
 */
public class PizzaStoreTestDrive {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore(new NYPizzaIngredientFactory());
        Pizza cheese = pizzaStore.orderPizza("cheese");

    }
}
