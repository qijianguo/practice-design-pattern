package com.qijianguo.design.pattern.decorator.v2;

/**
 * 配料：奶泡
 * @author qijianguo
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    private double price = 4.5;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + price;
    }

    @Override
    public String description() {
        return beverage.description() + ", whip ";
    }
}
