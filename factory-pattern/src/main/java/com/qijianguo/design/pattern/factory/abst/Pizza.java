package com.qijianguo.design.pattern.factory.abst;

/**
 * @author qijianguo
 */
public abstract class Pizza {

    private Dough dough;

    private Sauce sauce;

    private Cheese cheese;

    private Clams clams;

    abstract void prepare();

    void back() {
        System.out.println("back...");
    }

    void cut() {
        System.out.println("cut...");
    }

    void box() {
        System.out.println("box...");
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public Clams getClams() {
        return clams;
    }

    public void setClams(Clams clams) {
        this.clams = clams;
    }
}
