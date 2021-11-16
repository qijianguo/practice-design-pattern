package com.qijianguo.design.pattern.decorator.v2;

/**
 * 配料：牛奶
 * @author qijianguo
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    private double price = 5;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        description();
        return this.beverage.cost() + price;
    }

    @Override
    public String description() {
        return beverage.description() + ", milk ";
    }
}
