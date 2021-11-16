package com.qijianguo.design.pattern.decorator.v1;

public class HouseBlend extends Beverage {

    private double price = 20;

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return super.cost() + price;
    }
}
