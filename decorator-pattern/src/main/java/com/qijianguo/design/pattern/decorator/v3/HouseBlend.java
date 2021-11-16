package com.qijianguo.design.pattern.decorator.v3;

/**
 * @author qijianguo
 */
public class HouseBlend extends Beverage {

    private double price = 20;

    public HouseBlend(int size) {
        setSize(size);
        setDescription("House Blend");
    }

    @Override
    public double cost() {
        switch (this.getSize()) {
            case TALL:
                return 15;
            case VENTI:
                return 25;
            default:
                return price;
        }
    }
}
