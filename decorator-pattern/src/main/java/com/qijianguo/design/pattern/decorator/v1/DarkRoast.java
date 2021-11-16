package com.qijianguo.design.pattern.decorator.v1;

/**
 * @author qijianguo
 */
public class DarkRoast extends Beverage {

    private double price = 10;

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return super.cost() + price;
    }
}
