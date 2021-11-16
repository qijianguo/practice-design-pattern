package com.qijianguo.design.pattern.decorator.v2;

public class DarkRoast extends Beverage {

    private double price = 15;

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return price;
    }

}
