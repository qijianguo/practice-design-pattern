package com.qijianguo.design.pattern.factory.method;

public class PizzaStoreTestDrive {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoStylePizzaStore();
        Pizza chicago = pizzaStore.orderPizza("cheese");
        System.out.println(chicago);
    }
}
