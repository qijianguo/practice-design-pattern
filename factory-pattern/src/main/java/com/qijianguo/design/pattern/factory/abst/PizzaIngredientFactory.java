package com.qijianguo.design.pattern.factory.abst;

/**
 * 原料工厂
 * @author qijianguo
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Clams createClams();

}
