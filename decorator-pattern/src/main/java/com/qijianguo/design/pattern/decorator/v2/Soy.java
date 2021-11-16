package com.qijianguo.design.pattern.decorator.v2;

/**
 * 配料：豆浆
 * @author qijianguo
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    private double price = 6;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        description();
        return beverage.cost() + price;
    }

    @Override
    public String description() {
        return beverage.description + ", soy";
    }
}
