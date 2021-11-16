package com.qijianguo.design.pattern.decorator.v3;

/**
 * 配料：豆浆
 * @author qijianguo
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 6;
    }

    @Override
    public String description() {
        return beverage.description() + ", soy";
    }
}
