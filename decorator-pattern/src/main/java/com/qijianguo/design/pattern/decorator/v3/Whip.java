package com.qijianguo.design.pattern.decorator.v3;

/**
 * 配料：奶泡
 * @author qijianguo
 */
public class Whip extends CondimentDecorator {

    private final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        switch (beverage.getSize()) {
            case TALL:
                return beverage.cost() + 3;
            case VENTI:
                return beverage.cost() + 5;
            default:
                return beverage.cost() + 4.5;
        }
    }

    @Override
    public String description() {
        return beverage.description() + ", whip ";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }
}
