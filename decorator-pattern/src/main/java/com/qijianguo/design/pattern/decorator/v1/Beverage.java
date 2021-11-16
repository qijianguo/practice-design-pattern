package com.qijianguo.design.pattern.decorator.v1;

/**
 * @author qijianguo
 */
public abstract class Beverage {

    protected String description;

    private boolean milk;

    private boolean soy;

    private boolean mocha;

    private boolean whip;

    public double cost() {
        double price = 0;
        synchronized (this) {
            if (hasMilk()) {
                price += 2.5;
            }
            if (hasSoy()) {
                price += 5;
            }
            if (hasMocha()) {
                price += 3;
            }
            if (hasWhip()) {
                price += 4;
            }
        }
        return price;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

}
