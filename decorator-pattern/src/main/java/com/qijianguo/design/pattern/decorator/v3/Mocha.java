package com.qijianguo.design.pattern.decorator.v3;

/**
 * 配料：摩卡
 * @author qijianguo
 */
public class Mocha extends CondimentDecorator {

    private final Beverage beverage;

    public Mocha(Beverage condiment) {
        this.beverage = condiment;
    }

    @Override
    public double cost() {
        switch (this.beverage.getSize()) {
            case TALL:
                return beverage.cost() + 2;
            case VENTI:
                return beverage.cost() + 4;
            default:
                return beverage.cost() + 3;
        }
    }

    @Override
    public String description() {
        return beverage.description() + ", mocha";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }
}
