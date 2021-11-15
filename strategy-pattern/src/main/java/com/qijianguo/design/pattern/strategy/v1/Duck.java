package com.qijianguo.design.pattern.strategy.v1;

public abstract class Duck {
    public Duck() {
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    abstract void display();

    void swim() {
        System.out.println();
    }

    private FlyBehavior flyBehavior;

    public void performFlay() {
        flyBehavior.fly();
    }

    private QuackBehavior quackBehavior;

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
