package com.qijianguo.design.pattern.decorator.v3;

/**
 * 配料：牛奶
 * @author qijianguo
 */
public class Milk extends CondimentDecorator {

    private final Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case TALL:
                return beverage.cost() + 3;
            case VENTI:
                return beverage.cost() + 6;
            default:
                return beverage.cost() + 5;
        }
    }

    @Override
    public String description() {
        return beverage.description() + ", milk ";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }
}
