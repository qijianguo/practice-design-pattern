package com.qijianguo.design.pattern.decorator.v2;

public abstract class Beverage {

    String description = "Unknown Beverage";

    /**
     * 费用
     * @return
     */
    public abstract double cost();

    public String description() {
        return description;
    }
}
