package com.qijianguo.design.pattern.decorator.v3;

public class DarkRoast extends Beverage {

    private double price = 15;

    public DarkRoast(int size) {
        setSize(size);
        setDescription("Dark Roast");
    }

    @Override
    public double cost() {
        switch (getSize()) {
            case TALL:
                return 10;
            case VENTI:
                return 20;
            default:
                return price;
        }
    }

}
