package com.qijianguo.design.pattern.decorator.v3;

public abstract class Beverage {

    private String description = "Unknown Beverage";

    private int size;

    public static final int TALL = 1, GRANDE = 2, VENTI = 3;

    /**
     * 费用
     * @return
     */
    public abstract double cost();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String description() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
