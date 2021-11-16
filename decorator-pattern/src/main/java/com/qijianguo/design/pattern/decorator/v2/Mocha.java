package com.qijianguo.design.pattern.decorator.v2;

/**
 * 配料：摩卡
 * @author qijianguo
 */
public class Mocha extends CondimentDecorator {

    private final Beverage beverage;
    private double price = 3;

    public Mocha(Beverage condiment) {
        this.beverage = condiment;
    }

    @Override
    public double cost() {
        description();
        return beverage.cost() + price;
    }

    @Override
    public String description() {
        return beverage.description() + ", mocha";
    }
}
